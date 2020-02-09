package Fundamentos_Variables;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su Nombre:" );
		var nombre = scanner.nextLine();
		
		System.out.println("Ingrese su Apellido:" );
		var apellidoPaterno = scanner.nextLine();
		
		System.out.println("El Nombre completo es: \t" + nombre + apellidoPaterno);

	}

}
