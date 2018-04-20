import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int total_votos = 0;
        int nulos = 0;
        Candidatos c1;
        Candidatos c2;
        Candidatos c3;


        c1 = new Candidatos("Catalina", 0);
        c2 = new Candidatos("Arturo", 0);
        c3 = new Candidatos("Francisca", 0);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese voto: ");
        String votos = scanner.nextLine();

        while (!"F".equals(votos)) {

            total_votos += 1;

            if (c1.getNombre().equals(votos)) {
                c1.setVotos_candidato(c1.getVotos_candidato() + 1);
            } else if (c2.getNombre().equals(votos)) {
                c2.setVotos_candidato(c2.getVotos_candidato() + 1);
            } else if (c3.getNombre().equals(votos)) {
                c3.setVotos_candidato(c3.getVotos_candidato() + 1);
            } else {
                nulos +=1;
                System.out.println("ERROR AL INGRESAR EL VOTO");
            }

            System.out.println("Ingrese voto: ");
            votos = scanner.nextLine();

        }


        System.out.println("El total de votos fue: " + total_votos);
        System.out.println(c1.getNombre() + ":" + c1.getVotos_candidato() + " votos \nPorcentaje de votos de candidato 1: ");
        System.out.print(c1.getVotos_candidato()*100/total_votos + "%\n");
        System.out.println(c2.getNombre() + ":" + c2.getVotos_candidato() + " votos \nPorcentaje de votos de candidato 2: ");
        System.out.print(c2.getVotos_candidato()*100/total_votos + "%\n");
        System.out.println(c3.getNombre() + ":" + c3.getVotos_candidato() + " votos \nPorcentaje de votos de candidato 3: ");
        System.out.print(c3.getVotos_candidato()*100/total_votos + "%\n");
        System.out.println("\nNULOS:" + nulos + " votos");


        if (c1.getVotos_candidato() > c2.getVotos_candidato() && ((c1.getVotos_candidato() > c3.getVotos_candidato()) || c2.getVotos_candidato() >= c3.getVotos_candidato()))
        {
            System.out.println("El ganador es: " + c1.getNombre());
        }
        if (c2.getVotos_candidato() > c1.getVotos_candidato() && ((c1.getVotos_candidato() >= c3.getVotos_candidato()) || (c2.getVotos_candidato() > c3.getVotos_candidato())))
        {
            System.out.println("El ganador es: " + c2.getNombre());
        }

        if (c3.getVotos_candidato() > c1.getVotos_candidato() && ((c3.getVotos_candidato() > c2.getVotos_candidato()) || (c1.getVotos_candidato() >= c2.getVotos_candidato())))
        {
            System.out.println("El ganador es: " + c3.getNombre());
        }

        else
        {
            System.out.println("Hubo empate entre candidatos");
        }
    }
}

