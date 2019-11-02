package Fundamentos_SentenciasDeControl;

public class Switch {
	
	public static void main(String[] args) {

	      var numero = 1;
	      var numeroTexto = "numero desconocido";
	      
	      switch(numero){
	          case 1:
	              numeroTexto = "numero uno";
	              break;
	          case 2:
	              numeroTexto = "numero dos";
	              break;
	          case 3:
	              numeroTexto = "numero tres";
	              break;
	          default:
	              numeroTexto = "numero desconocido";
	      }
	      
	        System.out.println("numero texto:" + numeroTexto + " para el numero proporcionado:" + numero );
	    }

}
