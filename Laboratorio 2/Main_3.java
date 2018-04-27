import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main (String [] args) {

        Scanner scanner;
        Termometro termo;
        Termometro n_agitar;
        double promedio;
        Random t = new Random();
        scanner = new Scanner(System.in);
        int cont = 0; //Contador agitacion
        int real_t = 0; //Contador mediciones correctas

        //Temperatura despues de agitar el termometro
        int temp = t.nextInt(10)+1;

        //Agitar termometro
        System.out.println("¿Desea agitar el termometro?: (Ingrese 1 si lo desea) ");
        int n = scanner.nextInt();
        cont ++;

        while (cont <2) {
            System.out.println("¿Desea agitar el termometro? Ingrese 1 si lo desea" );
            n = scanner.nextInt();
            cont ++;
        }



        double t1 = t.nextDouble()*6+35;
        double t2 = t.nextDouble()*6+35;

        promedio = (t1 + t2)/2;

        if((promedio >=35) && (promedio <= 40)) {
            System.out.println("La temperatura promedio es: " + promedio + " grados celsius");
        }


    }

}
