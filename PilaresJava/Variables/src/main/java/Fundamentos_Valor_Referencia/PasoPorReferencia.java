package Fundamentos_Valor_Referencia;

public class PasoPorReferencia {
	
	public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Juan");
        
        System.out.println("valor nombre:" + persona.obtenerNombre());
        
        modificarPersona(persona);
       
        System.out.println("valor nombre modificado:" + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Carlos");
    }

}
