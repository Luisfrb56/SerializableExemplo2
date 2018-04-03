
package serializableexemplo2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializableExemplo2 {
    

    public static void main(String[] args) {
        Metodos obxf=null;
        obxf.escribirFicheiro("Orde.txt");
        obxf.lerFicheiro("Orde.txt");
        obxf.engadirFicheiro("Orde.txt");
        obxf.lerFicheiro("Orde.txt");
    }
    
}
