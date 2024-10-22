package model; /**
 * Classe que contém métodos para efetuar parsing de dados.
 *
 * 
 * 
 * 
 * @version 20190415
 */

import utils.Coordinate;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Random;

public class ParseDados{

    private ParseDados() {}

    public static Proprietario parseProprietario(String linha){
        String nome;
        String nif;
        String email;
        String morada;
        String [] dados = linha.split(",");
        int ano = new Random().ints(1950, 2000).findFirst().getAsInt();
        int mes = new Random().ints(0, 11).findFirst().getAsInt();
        int dia = new Random().ints(0, 30).findFirst().getAsInt();
        GregorianCalendar date = new GregorianCalendar(ano, mes, dia);

        nome = dados[0];
        nif = dados[1];
        email = dados[2];
        morada = dados[3];

        return new Proprietario(nome, nif, email, nif, morada, date);
    }

    public static Cliente parseCliente(String linha){
        String nome;
        String nif;
        String email;
        String morada;
        String [] dados = linha.split(",");
        int ano = new Random().ints(1950, 2000).findFirst().getAsInt();
        int mes = new Random().ints(1, 12).findFirst().getAsInt();
        int dia = new Random().ints(1, 31).findFirst().getAsInt();
        GregorianCalendar date = new GregorianCalendar(ano, mes, dia);
        double x = 0.0;
        double y = 0.0;


        nome = dados[0];
        nif = dados[1];
        email = dados[2];
        morada = dados[3];

        try {
            x = Double.parseDouble(dados[4]);
            y = Double.parseDouble(dados[5]);
        }
        catch(InputMismatchException exc){
            throw new InputMismatchException();
        }

        Coordinate cords = new Coordinate(x,y);

        return new Cliente(nome, nif, email, nif, morada, date, cords, 0, 0, 0.0);

    }

    public static Veiculo parseVeiculo(String linha){
        String marca;
        String matricula;
        String nif;
        String [] dados = linha.split(",");
        int velocidade;
        int autonomia;
        double x;
        double y;
        double preco;
        double consumo;

        marca = dados[1];
        matricula = dados[2];
        nif = dados[3];

        try {
            velocidade = Integer.parseInt(dados[4]);
            preco = Double.parseDouble(dados[5]);
            consumo = Double.parseDouble(dados[6]);
            autonomia = Integer.parseInt(dados[7]);
            x = Double.parseDouble(dados[8]);
            y = Double.parseDouble(dados[9]);
        } catch(InputMismatchException ime) {
            switch(dados[0]){
                case "Electrico":
                    return new CarroEletrico();
                case "Hibrido":
                    return new CarroHibrido();
                case "Gasolina":
                    return new CarroGasolina();
                default:
                    return new Veiculo();
            }
        }

        Coordinate cords = new Coordinate(x,y);

        switch(dados[0]){
            case "Electrico":
                return new CarroEletrico(marca, matricula, nif, velocidade, preco, consumo,
                        autonomia, cords, true, 0, new ArrayList<ParDatas>());
            case "Hibrido":
                return new CarroHibrido(marca, matricula, nif, velocidade, preco, consumo,
                        autonomia, cords, true, 0, new ArrayList<ParDatas>());
            case "Gasolina":
                return new CarroGasolina(marca, matricula, nif, velocidade, preco, consumo,
                        autonomia, cords, true, 0, new ArrayList<ParDatas>());
            default:
                return new Veiculo();
        }
    }
}
