package utils; /**
 * Classe que abstrai a utilização da classe Scanner, escondendo todos os
 * problemas relacionados com excepções, e que oferece métodos simples e
 * robustos para a leitura de valores de tipos simples e String.
 *
 * É uma classe de serviços, como Math e outras de Java, pelo que devem ser
 * usados os métodos de classe implementados.
 *
 * Utilizável em BlueJ, NetBeans, CodeBlocks ou Eclipse.
 * 
 * Utilização típica:  int x = utils.Input.lerInt();
 *                     String nome = utils.Input.lerString();
 * 
 * 
 * @version 1.0 (6/2006)
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Input {

    private Input() {}

 /**
  * Métodos de Classe
  */
    
 public static String lerString(String invalido, String novo) {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     String txt = "";
     while(!ok) {
         try {
             txt = input.nextLine();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println(invalido); 
               out.print(novo);
               input.nextLine(); 
             }
     }
     return txt;
  } 

 
 public static int lerInt(String invalido, String novo) {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     int i = 0; 
     while(!ok) {
         try {
             i = input.nextInt();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println(invalido); 
               out.print(novo);
               input.nextLine(); 
             }
     }
     return i;
  } 
  
  public static double lerDouble(String invalido, String novo) {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     double d = 0.0; 
     while(!ok) {
         try {
             d = input.nextDouble();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println(invalido); 
               out.print(novo);
               input.nextLine(); 
             }
     }
     return d;
  }  
  
   public static float lerFloat(String invalido, String novo) {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     float f = 0.0f; 
     while(!ok) {
         try {
             f = input.nextFloat();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println(invalido); 
               out.print(novo);
               input.nextLine(); 
             }
     }
     return f;
  }  
  
   public static boolean lerBoolean(String invalido, String novo) {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     boolean b = false; 
     while(!ok) {
         try {
             b = input.nextBoolean();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println(invalido); 
               out.print(novo);
               input.nextLine(); 
             }
     }
     return b;
  } 
  
  public static short lerShort(String invalido, String novo) {
     Scanner input = new Scanner(in);
     boolean ok = false; 
     short s = 0; 
     while(!ok) {
         try {
             s = input.nextShort();
             ok = true;
         }
         catch(InputMismatchException e) 
             { out.println(invalido); 
               out.print(novo);
               input.nextLine(); 
             }
     }
     return s;
  }
  
       public static GregorianCalendar lerData(String errorMessage, String message) {
         Scanner input = new Scanner(in);
         boolean ok = false;
         boolean erro;
         GregorianCalendar date = null;
         SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
         String str = "";
         String[] fields;
         int d = 0;
         int m = 0;
         int y = 0;
         
         /* enquanto não for inserida uma data válida */
         while (!ok) {
             erro = false;
             /* Lê-se a data */
             str = Input.lerString(errorMessage, message);
                
             ft.setLenient(false);
             
             /* Faz-se o parsing da string lida para o tipo SimpleDateFormat. */
             
             try {
                 ft.parse(str);
             }
             
             /* Caso a data não seja válida, é exibida a mensagem de erro e é pedido que se insira uma nova 
              * data. */
             
             catch (ParseException e) {
                 out.println(errorMessage);
                 out.print(message);
                 continue;
             }
             
             /* Separam-se os campos pelo carater "-". */
             
             fields = str.split("-");
             
             /* São lançadas as exceções relativas à leitura de um inteiro para cada um dos três campos. */
             
             try {
                 d = Integer.parseInt(fields[0].trim());
             }
             catch (NumberFormatException | NullPointerException e) {
                 out.println(errorMessage);
                 out.print(message);
                 erro = true;
             }
             
            if (!erro) {
                try {
                    m = Integer.parseInt(fields[1].trim());
                }
                catch (NumberFormatException | NullPointerException e) {
                    out.println(errorMessage);
                    out.print(message);
                    erro = true;
                }
            }
             
            if (!erro) {
                try {
                    y = Integer.parseInt(fields[2].trim());
                }
                catch (NumberFormatException | NullPointerException e) {
                    out.println(errorMessage);
                    out.print(message);
                }
            }
             
             /* O boolean ok é posto a true, indicando que foi lida uma data válida. */
             
             ok = true;
         }
         
         /* É criada a variável referente à data que foi lida e é devolvida no return. */
         
         date = new GregorianCalendar(y, --m, d); 
         
         input.close();
         return date;
     }
}