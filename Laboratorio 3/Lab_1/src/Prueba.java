import java.util.ArrayList;
import java.util.Random;

public class Prueba {

    ArrayList<String>prueba = new ArrayList<>();

    Preguntas preguntas = new Preguntas();
    Puntaje puntaje = new Puntaje();
    Random random = new Random();
    int test = 0;
    int suma = 0;
    int contador = 0;
    String s;
    int pregunta_azar = random.nextInt(preguntas.getContador()+1);

    public void setPrueba(){
        System.out.println("hoal");
        while(test !=1){
            System.out.println("while");
            while(contador < 5){
                pregunta_azar = random.nextInt(preguntas.getContador()+1);
                prueba.add(s);
                suma += puntaje.getPuntos().get(pregunta_azar);
            }
            if(suma == 100){
                test = 1;
            }
            else{
                prueba.remove(prueba);
                System.out.println("Error al formular la prueba, reiniciando el proceso...");
            }
        }
    }

    public ArrayList<String> getPrueba(){
        return prueba;
    }
}
