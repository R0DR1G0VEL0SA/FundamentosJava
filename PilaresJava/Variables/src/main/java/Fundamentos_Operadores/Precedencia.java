package Fundamentos_Operadores;

public class Precedencia {

	public static void main(String[] args) {

        var x = 5;
        var y = 10;
        var z = ++x + y--;//x=6, y=10, z=16
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("\nEjemplo 2 precedencia operadores");
        var resultado = 4 + 5 * 6 / 3;// 4+((5*6)/3) => 4+(30/3) => 4+10 => 14
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
        
    }
}
