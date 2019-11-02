package Fundamentos_Constructores;

public class PruebaAritmetica2 {
	
   public static void main(String[] args) {
        
        //Creamos un objeto de tipo aritmetica
        Aritmetica2 aritmetica = new Aritmetica2();
        aritmetica.a = 10;
        aritmetica.b = 3;
        int resultado = aritmetica.sumar();
        
        System.out.println("resultado = " + resultado);
        
        //Creacion de un segundo objeto Aritmetica
        Aritmetica2 aritmetica2 = new Aritmetica2(4, 2);
        System.out.println("resultado2 = " + aritmetica2.sumar() );
        
    }

}
