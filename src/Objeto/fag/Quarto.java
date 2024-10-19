package Objeto.fag;

public class Quarto{
	
	private String Número;
	private String Tipo;
	private float Preço;
	private String disponibilidade;
	
	public Quarto(String número, String tipo, float preço, String disponibilidade) {
		super();
		Número = número;
		Tipo = tipo;
		Preço = preço;
		this.disponibilidade = disponibilidade;
	}

	public String getNúmero() {
		return Número;
	}

	public void setNúmero(String número) {
		Número = número;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public float getPreço() {
		return Preço;
	}

	public void setPreço(float preço) {
		Preço = preço;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "Quarto [Número=" + Número + ", Tipo=" + Tipo + ", Preço=" + Preço + ", disponibilidade="
				+ disponibilidade + "]";
	}
	
}
