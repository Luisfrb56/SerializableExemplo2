
package serializableexemplo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Metodos {
    
    public String cadea(String s){
     return JOptionPane.showInputDialog(s);
 }
 
public int enteiro(String s){
     return Integer.parseInt(JOptionPane.showInputDialog(s));
 }
  public int dec(String s){
     return (int) Float.parseFloat(JOptionPane.showInputDialog(s));
 }    
  
  
public void escribirFicheiro(String ficheiro){
        ObjectOutputStream fich=null;
        try{
            fich =new ObjectOutputStream(new FileOutputStream (ficheiro));
            for(int i=0;i<5;i++){
                Ordenador t=new Ordenador(enteiro("Memoria procesador: "),enteiro("Velocidade procesador: "),cadea("Marca pantalla: "),dec("Pulgadas: "),cadea("Tipo de rato: "));
                fich.writeObject(t);
            }
       } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
            if(fich != null)
                try {
                    fich.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
public void engadirFicheiro(String Ficheiro){
    OutputPropio meu=null;
        ObjectOutputStream fich = null;        
        try
        {
                      
 new FileOutputStream(Ficheiro,true);            
            for (int i = 0; i <1; i++) 
            {
              
                
                Ordenador t=new Ordenador(enteiro("Memoria procesador: "),enteiro("Velocidade procesador: "),cadea("Marca pantalla: "),dec("Pulgadas: "),cadea("Tipo de rato: "));
                meu.writeObject(t);
               
            }
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
            if(meu != null)
                try {
                 meu.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   


public void lerFicheiro(String Ficheiro){
    ObjectInputStream ler=null;
    Ordenador aux=null;
 try {
            ler = new ObjectInputStream(new FileInputStream(Ficheiro));
       
             aux=(Ordenador)ler.readObject();
             while(aux!= null){
                 System.out.println(aux.toString());
                 aux=(Ordenador)ler.readObject();
             }
        }    
          catch (ClassNotFoundException ex) {
              System.out.println("erro 1" +ex.getMessage());      
                    
           } catch (IOException ex) {
            System.out.println("erro 2" +ex.getMessage());
        }
     finally{
            if(ler != null)
                try {
                    ler.close();
            } catch (IOException ex) {
                    System.out.println("erro de peche "+ex.getMessage());
            }
        }
 }            
        
}