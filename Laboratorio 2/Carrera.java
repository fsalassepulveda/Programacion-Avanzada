public class Carrera {

    private Rana rana1;
    private Rana rana2;
    private int longitud;
    int s_rana1 = 0, s_rana2 = 0;



    public Carrera(int longitud) {
        this.longitud = longitud;
    }

    //Setter
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    void Versus(Rana rana1, Rana rana2){ //INICIO CARRERA

        while((s_rana1< longitud) && (s_rana2< longitud)){
            s_rana1 += rana1.saltoRana();
            s_rana2 += rana2.saltoRana();
            System.out.println("Distancia rana color " + rana1.getColor() + " es: " + s_rana1 + " metro(s)");
            System.out.println("Distancia rana color " +  rana2.getColor()+ " es: " + s_rana2 + " metro(s)\n");
        }

        if(s_rana1 > s_rana2){
            System.out.println("El ganador es la rana color: " + rana1.getColor());
        }
        if(s_rana1 < s_rana2){
            System.out.println("El ganador es la rana color: " + rana2.getColor());
        }
        if(s_rana2 == s_rana1){
            System.out.println("Es un empate");
        }


    }


}