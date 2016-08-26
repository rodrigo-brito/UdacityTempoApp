package net.rodrigobrito.tempo.model;

/**
 * Created by rodrigo on 26/08/16.
 */
public class Previsao {
    private String data;
    private float temperaturaMinima;
    private float temperaturaMaxima;
    private String icone;

    public Previsao(String data, float temperaturaMinima, float temperaturaMaxima, String icone) {
        this.data = data;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.icone = icone;
    }

    public float getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public float getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(float temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.getData()+" - "+this.getTemperaturaMinima()+"/"+this.getTemperaturaMaxima()+" ["+this.getIcone()+"]";
    }
}
