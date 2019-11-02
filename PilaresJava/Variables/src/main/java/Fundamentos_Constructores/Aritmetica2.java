package Fundamentos_Constructores;

public class Aritmetica2 {
	
	//atributos de la clase
    int a;
    int b;
    
    public Aritmetica2(){
//        a = 5;
//        b = 3;
        System.out.println("Ejecutando constructor vacio");
    }
    
    public Aritmetica2(int arg1, int arg2){
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando constructor con dos argumentos");
    }
    
    public int sumar(){
        int resultado = a + b;//se utilizan los atributos de la clase 
        return resultado;
    }

}
