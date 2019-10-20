package Fundamentos;

public class Concatenacion {
	
	public static void main(String[] args) {

        var usuario = "Juan";
        var saludar = "Hola";

        System.out.println(saludar + " " + usuario);

        var i = 3;
        var j = 5;
        System.out.println(i + j);
        
        System.out.println(saludar + i + j);// primero encuentra cadena, por lo tanto lo restante lo concatena
        
        System.out.println(i + j + saludar);// primero encuentra numeros, por lo tanto primero suma y despues concatena
    }

}
