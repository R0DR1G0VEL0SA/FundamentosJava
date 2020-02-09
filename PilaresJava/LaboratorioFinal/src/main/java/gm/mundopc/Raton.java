package gm.mundopc;

public class Raton extends DispositivoEntrada{
	
	//Attributes of  class 
	private final int idRaton;
	private static int contadorRatones;
	
	//constructor method
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++contadorRatones;
	}

	//to string method
	@Override
	public String toString() {
		return super.toString() + "Raton [idRaton=" + idRaton + "]";
	}

}
