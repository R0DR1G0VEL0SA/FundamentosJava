package Fundamentos_SentenciasDeControl;

public class SentenciaIF {
	
	public static void main(String[] args) {

        var condicion = false;

        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }
        
        var numero = 2;
        var numeroTexto = "numero desconocido";
        
        if( numero == 1 ){
            numeroTexto = "numero uno";
        }
        else if( numero == 2){
            numeroTexto = "numero dos";
        }
        else if( numero == 3){
            numeroTexto = "numero tres";
        }
        else{
            numeroTexto = "valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);

    }

}
