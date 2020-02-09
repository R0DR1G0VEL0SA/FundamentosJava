package gm.mundopc;

public class Monitor {

	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;

	// constructor method private

	private Monitor() {
		idMonitor = ++contadorMonitores;
	}

	// Constructor sobrecargado

	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}

	// getters and setters

	public int getIdMonitor() {
		return idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}


	//to string method
   @Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
	}

}
