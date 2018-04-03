
package serializableexemplo2;


public class Rato {
     private String tipo;
    public Rato() {
    }

    public Rato(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Tipo=" + tipo;
    }
    
}
