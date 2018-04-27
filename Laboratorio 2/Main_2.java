import java.util.Scanner;

public class Main {

//Ejercicio 2

    public static void main ( String [] args){

        Rana s1;
        Rana s2;
        Carrera c;

        s1 = new Rana( "Azul");
        s2 = new Rana("Verde");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese longitud de los carriles:");
        int longi = scanner.nextInt();
        while((longi != 15) && (longi != 20) && (longi != 30)){
            System.out.println("Error");
            System.out.println("Ingrese longitud de los carriles:");
            longi = scanner.nextInt();
        }


        c = new Carrera(longi);


        c.Versus(s1,s2);
    }


}
