package model;
/**
 * Escreva a descrição da classe model.Weather aqui.
 * 
 * 
 * @version (número de versão ou data)
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class Weather {
    
    private Weather() {}

    /**
     * COnstrutor para objetos da classe model.Weather
     */
    public static Map<String, Object> jsonToMap(String str) {
        return new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {}.getType());
    }
    /**
     * Calcurar percentagem de subida de preço dependendo do tempo
     */
    public static double getPercentage( double latitude, double longitude){
        String apiKey = "28c4efcbaf88fde7e5ae89d0b8f05dcd";
        String urlString = "http://api.openweathermap.org/data/2.5/weather?lat=" + latitude + "&lon=" + longitude +"&appid=" + apiKey;
        double percentage = 0.0;
     try {
         StringBuilder result = new StringBuilder();
         URL url = new URL(urlString);
         URLConnection conn = url.openConnection();
         BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         String line;
         while((line = rd.readLine()) != null) {
             result .append(line);
            }
           rd.close();
           System.out.println(result);
           
           Map<String, Object> respMap = jsonToMap(result.toString());
           Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
           Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
           
           double temp =(Double) mainMap.get("temp");
           double hum = (Double) mainMap.get("humidity");
           double wSpeed = (Double) windMap.get("speed");
           double wAngle = (Double) windMap.get("deg");
           percentage = (temp*0.4/4 + hum*0.4/4 + wSpeed*0.15/4 + wAngle*0.05/4) / 100;
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
         return percentage;
    }
}
