package Saida;

public class Vagas {
    private int numero;
    private String tamanho;
    private String disponibilidade;
    private int horarioEntrada; // Armazena o horário de entrada
    private int horarioSaida;   // Armazena o horário de saída

    public Vagas(int numero, String tamanho, String disponibilidade) {
        this.numero = numero;
        this.tamanho = tamanho;
        this.disponibilidade = disponibilidade;
        this.horarioEntrada = 0; // Inicializa como 0 ou um valor padrão
        this.horarioSaida = 0;   // Inicializa como 0 ou um valor padrão
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(int horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public int getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(int horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    @Override
    public String toString() {
        return "Vagas [Numero=" + numero + ", Tamanho=" + tamanho + ", Disponibilidade=" + disponibilidade 
               + ", Horário de Entrada=" + horarioEntrada + ", Horário de Saída=" + horarioSaida + "]";
    }
}
