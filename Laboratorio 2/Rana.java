import java.util.Random;
public class Rana {

    private String color;
    private int distancia;
    private String duenio;
    private Random metros = new Random();

    int salto;

    public Rana(String color) {
        this.color = color;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    //Getters

    public String getColor() {
        return color;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getDuenio() {
        return duenio;
    }

    int saltoRana() {
        salto = metros.nextInt(3) + 1;
        System.out.println("La rana color "+ color + " salto una distancia de " + salto + " metros");
        return salto;
    }

}

