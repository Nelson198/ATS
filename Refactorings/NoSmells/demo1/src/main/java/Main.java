import Controller.Controller;
import Model.Parser;
import Model.UMCarroJa;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {
        UMCarroJa model = new UMCarroJa();
        try {
            model = UMCarroJa.read(".tmp");
            LOGGER.log(Level.ALL, "adasdsada1");
        }
        catch (IOException | ClassNotFoundException e) {
            LOGGER.log(Level.ALL, "adasdsada2");
            new Parser("db/logsPOO_carregamentoInicial.bak", model);
        }
        try { Thread.sleep(10000);} catch (Exception e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
        new Controller(model).run();
        try {
            model.save(".tmp");
        }
        catch (IOException e) {
            LOGGER.log(Level.ALL, e.toString(), e);
        }
    }
}
