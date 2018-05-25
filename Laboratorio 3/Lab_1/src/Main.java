import java.util.ArrayList;

public class Main {

    public static void main( String []args){

        Preguntas preguntas = new Preguntas();
        Puntaje puntaje = new Puntaje();
        Prueba prueba = new Prueba();

        preguntas.setPreguntas();
        System.out.println(preguntas.getPreguntas());
        System.out.println(preguntas.getContador());

        puntaje.setPuntaje();


        prueba.setPrueba();
        System.out.println(prueba.getPrueba());





    }
}
