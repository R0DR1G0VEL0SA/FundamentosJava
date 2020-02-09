package Fundamentos_Constructores;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Clase Scanner
		Scanner scanner = new Scanner(System.in);

		// Variables Locales.
		System.out.println("Bienvenido");
		System.out.println("-----------------------------");
		System.out.print("Ingrese su Nombre:");
		String nomb = scanner.nextLine();
		System.out.print("Ingrese su Apellido:");
		String apelli = scanner.nextLine();
		System.out.print("Ingrese su Tipo Doc:");
		String tipo = scanner.nextLine();
		System.out.print("Ingrese su Numero de  Doc:");
		String num = scanner.nextLine();

		// Creacion de objetos enviando argumentos
		Personas cliente = new Personas(nomb, apelli, tipo, num);

		Personas provedor = new Personas("Software Innovations", "N", "1022347467");

		cliente.imprimirDatos(cliente.getSperson());

		// Asignando Valores y modificando por Teclado al objeto tipo cliente
		//cliente.setSperson(1);
		cliente.setNombre("Jose");
		cliente.setApellido("Gil");
		cliente.setTipoDoc("S");
		cliente.setNumDoc("1022347469");

		cliente.imprimirDatos(cliente.getSperson());
		provedor.imprimirDatos(provedor.getSperson());
		
		System.out.println(cliente);
		System.out.println(provedor);
		
		Personas.getContadorPersonas();
	}

}
