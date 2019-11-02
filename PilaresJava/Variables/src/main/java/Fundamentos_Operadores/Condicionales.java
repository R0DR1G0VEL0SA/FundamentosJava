package Fundamentos_Operadores;

public class Condicionales {
	
    public static void main(String[] args) {
        
        int a = 15;
        int valorMinimo = 0, valorMaximo=10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        boolean vacaciones = false;
        boolean diaDescanso = true;
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego del hijo");
        else
            System.out.println("Padre ocupado");
                
        
    }

}
