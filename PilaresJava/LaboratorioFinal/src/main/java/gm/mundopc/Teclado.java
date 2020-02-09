package gm.mundopc;

public class Teclado extends DispositivoEntrada{

	// Attributes of class
	private final int idTeclado;
	private static int contadorTeclado;
	
	// constructor method super
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++contadorTeclado;
	}

	// to string method
	@Override
	public String toString() {
		return super.toString() + "Teclado [idTeclado=" + idTeclado + "]";
	}
    
}
