
package serializableexemplo2;


public class Ordenador {
    private Cpu procesador;
    private Pantalla pantalla;
    private Rato rato;
    
    public Ordenador (int memoria,int velocidade,String marc,float pulg, String tip){
        procesador.setMemoria(memoria);
        procesador.setVelocidade(velocidade);
        pantalla.setMarca(marc);
        pantalla.setPulgadas(pulg);
        rato.setTipo(tip);
    }

    public Ordenador() {
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Rato getRato() {
        return rato;
    }

    @Override
    public String toString() {
        return "Procesador: " + procesador + "\n Pantalla: " + pantalla + "\n Rato: " + rato;
    }

}
