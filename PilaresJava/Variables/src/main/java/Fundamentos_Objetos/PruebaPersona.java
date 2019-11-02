package Fundamentos_Objetos;

public class PruebaPersona {
	
    public static void main(String[] args) {
        
        //Creacion de un objeto de tipo Persona
        
        //Definicion de la variable de tipo Persona
        Persona persona1;
        
        //Instanciando (creando) un objeto de la clase Persona
        persona1 = new Persona();
        
        //Accedemos al objeto persona, y llamamos al metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modificamos los valores de los atributos del objeto Persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creacion de un segundo objeto de tipo Persona
        Persona persona2 = new Persona();
        persona2.nombre = "Karla";
        persona2.apellido = "Gomez";
        
        System.out.println("");
        persona2.desplegarNombres();
        
    }

}
