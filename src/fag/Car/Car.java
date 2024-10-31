package fag.Car;

public class Car {
    private String placa;
    private String modelo;
    private String tamanho;
    private int horarioEntrada;

    public Car(String placa, String modelo, String tamanho, int horarioEntrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.horarioEntrada = horarioEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(int horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

   
    public String toString() {
        return "Car [placa=" + placa + ", modelo=" + modelo + ", tamanho=" + tamanho + ", horarioEntrada=" + horarioEntrada + "]";
    }
}
