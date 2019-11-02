package Fundamentos_Constructores;

public class PruebaAritmetica1 {
	
public static void main(String[] args) {
        
        //Creamos un objeto de tipo aritmetica
        Aritmetica1 aritmetica = new Aritmetica1();
        aritmetica.a = 10;
        aritmetica.b = 3;
        int resultado = aritmetica.sumar();
        
        System.out.println("resultado = " + resultado);
    }

}
