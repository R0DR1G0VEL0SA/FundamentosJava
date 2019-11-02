package Fundamentos_Operadores;

public class IgualdadRelacionales {
	
	public static void main(String[] args) {
        
	       int a=3, b=4;
	       
	       boolean c = (a == b);
	        System.out.println("c = " + c);
	        
	        c = (a != b);
	        System.out.println("c = " + c);
	        
	        String cadena = "hola";
	        String cadena2 = "hola";
	        System.out.println( cadena.equals(cadena2) );
	        
	        boolean d = a <= b;
	        System.out.println("d = " + d);
	        
	        if( b % 2 == 0){
	            System.out.println("numero par");
	        }
	        else{
	            System.out.println("numero impar");
	        }
	        
	        int edad = 31;
	        int adulto = 18;
	        if ( edad >= adulto)
	            System.out.println("es un adulto");
	        else
	            System.out.println("es menor de edad");
	        
	    }

}
