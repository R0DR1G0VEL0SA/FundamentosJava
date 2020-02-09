package gm.mundopc;

public class DispositivoEntrada {
	
	//Attributes of class
	private String tipoEntrada;
	private String marca;

	// constructor whit arguments
	public DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	// getters and setters
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Meted to string
	@Override
	public String toString() {
		return "DispositivoEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
	}

}
