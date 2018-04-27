public class Termometro {

    double n_agitar;
    double temperatura_real;
    double p_temperatura;

    public Termometro(int n_agitar) {
        this.n_agitar = n_agitar;
    }


    //Setter
    public void setN_agitar(double n_agitar) {

        this.n_agitar = n_agitar;
    }

    public void setTemperatura_real(double temperatura_real) {

        this.temperatura_real = temperatura_real;
    }

    //Getter
    public double getN_agitar() {

        return n_agitar;
    }

    public double getTemperatura_real() {

        return temperatura_real;
    }


}
