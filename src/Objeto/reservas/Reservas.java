package Objeto.reservas;

public class Reservas{
	private String Nome;
	private String Datadeinicio;
	private String Datadefim;
	private int quantidade;
	private String Tipe;
	public Reservas(String nome, String datadeinicio, String datadefim, int quantidade, String tipe) {
		super();
		Nome = nome;
		Datadeinicio = datadeinicio;
		Datadefim = datadefim;
		this.quantidade = quantidade;
		Tipe = tipe;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDatadeinicio() {
		return Datadeinicio;
	}
	public void setDatadeinicio(String datadeinicio) {
		Datadeinicio = datadeinicio;
	}
	public String getDatadefim() {
		return Datadefim;
	}
	public void setDatadefim(String datadefim) {
		Datadefim = datadefim;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipe() {
		return Tipe;
	}
	public void setTipe(String tipe) {
		Tipe = tipe;
	}
	@Override
	public String toString() {
		return "Reservas [Nome=" + Nome + ", Datadeinicio=" + Datadeinicio + ", Datadefim=" + Datadefim
				+ ", quantidade=" + quantidade + ", Tipe=" + Tipe + "]";
	}
	
	
	
}