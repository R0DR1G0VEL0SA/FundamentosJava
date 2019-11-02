package Fundamentos_Constructores;

public class Aritmetica1 {
	
	//atributos de la clase
    int a;
    int b;
    
    public Aritmetica1(){
//        a = 5;
//        b = 3;
        System.out.println("Ejecutando constructor vacio");
    }
    
    public int sumar(){
        int resultado = a + b;//se utilizan los atributos de la clase 
        return resultado;
    }

}
