import java.util.ArrayList;
import java.util.Scanner;


public class Preguntas {
    ArrayList<String> preguntas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String teclado;
    int contador = 0;


    //Setter
    public void setPreguntas() {
        System.out.println("Ingrese preguntas; Para terminar escriba 'Listo' \nCuando termine de ingresar todas las preguntas escriba 'Listo'\nPregunta " + (contador +1)+  " :");
        teclado = scanner.nextLine();
        preguntas.add(teclado);
        contador ++;

        while(!"Listo".equals(teclado)){
            System.out.println("Pregunta " + (contador +1)+" :");
            teclado = scanner.next();
            if(!"Listo".equals(teclado)){
                preguntas.add(teclado);
                contador++;
            }
        }
    }

    //Getter
    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public int getContador(){
        return contador;
    }





}
