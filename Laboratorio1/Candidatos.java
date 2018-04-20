import java.util.ArrayList;
public class Candidatos {

    private String nombre;
    private int votos_candidato;

    Candidatos (String nombre, int votos_candidato){

        this.nombre = nombre;
        this.votos_candidato = votos_candidato;
    }


    //Setter
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setVotos_candidato(int votos_candidato)
    {
        this.votos_candidato = votos_candidato;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    public int getVotos_candidato() {
        return votos_candidato;
    }





}
