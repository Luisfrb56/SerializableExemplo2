
package serializableexemplo2;


public class Cpu {
       private int velocidade;
    private int memoria;

        public Cpu() {
    }
    
    public Cpu(int velocidade, int memoria) {
        this.velocidade = velocidade;
        this.memoria = memoria;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Velocidade=" + velocidade + ", Memoria=" + memoria;
    }

}
