import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Puntaje {

    Scanner scanner = new Scanner(System.in);
    Preguntas preguntas = new Preguntas();
    ArrayList<Integer> puntos = new ArrayList<>();
    int puntaje;
    int cont= 0;

    public void setPuntaje() {
        System.out.println("A CONTINUACION DEBE INGRESAR PUNTAJE DE LAS PREGUNTAS");
        System.out.println("Ingrese puntaje de la pregunta " + (cont + 1));
        puntaje = scanner.nextInt();
        puntos.add(puntaje);
        cont++;
        while(cont <= preguntas.getContador()) {
            System.out.println("While: Ingrese puntaje de la pregunta " +(cont +1));
            puntaje = scanner.nextInt();
            puntos.add(puntaje);
            cont++;
        }
    }


    public ArrayList<Integer> getPuntos(){
        //System.out.println(puntos);
        return puntos;
    }

}
