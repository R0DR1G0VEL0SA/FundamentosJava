package gm.mundopc;


public class Orden {
	
	//Attributes of class
	private final int idOrden;
	private final Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private final static int MAX_COMPUTADORAS = 50;
	
	//method constructor initialize
	public Orden(){
		this.idOrden = ++contadorOrdenes;
		computadoras = new Computadora[MAX_COMPUTADORAS];
	}

	//method add computer
	public void agregarComputadora(Computadora pc) {
        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
        	computadoras[this.contadorComputadoras++] = pc;
        } else {
            System.out.println("Se ha superado el màximo de Items:" + MAX_COMPUTADORAS);
        }
    }
	
	// calculator Operations
	public double calcularTotal(){
        double total = 0;
        for(int i=0; i < this.contadorComputadoras; i++){
        	Computadora pc = this.computadoras[i];
           // total +=  pc.   producto.getPrecio();//total = total + producto.getPrecio()
        }
        return total;
    }
	
	//
	public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
	
}