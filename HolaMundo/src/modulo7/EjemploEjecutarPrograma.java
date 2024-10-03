package modulo7;

import java.io.IOException;
import java.util.Locale;

public class EjemploEjecutarPrograma {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        Process proceso;

        if ( System.getProperty("os.name").toLowerCase(Locale.ROOT).startsWith("windows")){
            try {
                proceso = rt.exec("notepad");

                proceso.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Comando no reconocido");
               System.exit(0);
            }


        }
    }
}
