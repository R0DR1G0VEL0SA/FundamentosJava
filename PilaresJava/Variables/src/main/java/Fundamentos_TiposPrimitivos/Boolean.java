package Fundamentos_TiposPrimitivos;

public class Boolean {
	
	public static void main(String[] args) {

        //boolean
        System.out.println("true tipo boolean: " );
        System.out.println("false tipo boolean: " );
        
        boolean booleanVar = false;
        
        if(booleanVar){
            System.out.println("el valor es verdadero");
        }
        else{
            System.out.println("el valor es falso");
        }
        
        System.out.println("");
        
        var edad = 30;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);

    }

}
