package Fundamentos_SentenciasDeControl;

import java.util.Scanner;

public class EjercicioSwitch {
	
	public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Proporcionar el valor del mes");
        var mes = scanner.nextInt();
        String estacion = null;
        
        switch ( mes ){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        
        System.out.println("estacion: " + estacion + " para el mes:" + mes);
    }

}
