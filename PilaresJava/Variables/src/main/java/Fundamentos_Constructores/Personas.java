package Fundamentos_Constructores;

public class Personas {

	// Variables de Clase
	static int contadorPersonas;
	int sperson;
	String nombre;
	String apellido;
	String tipoDoc;
	String numDoc;
	String razonSocial;

	// Constructor Vacio
	Personas() {
		System.out.println("Ejecutando constructor Vacio");
	}

	// Constructor para Clientes
	Personas(String nombre, String apellido, String tipoDoc, String numDoc) {
		contadorPersonas++;
		this.sperson = contadorPersonas;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;

		System.out.println("-------");
		System.out.println("Ejecutando constructor Clientes");
	}

	// Constructor para Proveedores
	Personas(String razonSocial, String tipoDoc, String numDoc) {
		this.sperson = ++contadorPersonas;
		this.razonSocial = razonSocial;
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
		System.out.println("Ejecutando constructor Proveedores");
	}

	// Generacion Automatico de Getters and Setters

	public int getSperson() {
		return sperson;
	}

	/*public void setSperson(int sperson) {
		this.sperson = sperson;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	// Metodo para imprimir Datos Basicos
	public void imprimirDatos(int sperson) {

		System.out.println("***************************************");

		if (sperson == 1) {
			System.out.println("nombre: " + this.nombre + " " + this.apellido);
		} else
			System.out.println("nombre: " + this.razonSocial);

		System.out.println("Tipo Doc: " + this.tipoDoc + " " + "Numero de Documento: " + this.numDoc);
		System.out.println("***************************************");

	}

	@Override
	public String toString() {
		return "Personas [sperson=" + sperson + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDoc=" + tipoDoc
				+ ", numDoc=" + numDoc + ", razonSocial=" + razonSocial + "]";
	}
	
	

	public static int getContadorPersonas() {
		return contadorPersonas;
		
		//System.out.println(contadorPersonas);
		// TODO Auto-generated method stub
		
	}
}
