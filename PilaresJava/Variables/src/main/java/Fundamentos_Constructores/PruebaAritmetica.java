package Fundamentos_Constructores;

public class PruebaAritmetica {
	
public static void main(String[] args) {
        
        //Creamos un objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        
        int resultado1 = aritmetica.sumar(5, 3);
        
        System.out.println("resultado = " + resultado1);
    }

}
