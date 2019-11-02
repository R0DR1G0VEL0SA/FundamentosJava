package Fundamentos_TiposPrimitivos;

public class Integers {
	
	public static void main(String[] args) {

        //byte, short, int, long
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);

        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipos byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);

        short shortVar = 32767;
        System.out.println("shortVar = " + shortVar);

        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipos short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);

        int intVar = 2147483647;
        System.out.println("intVar = " + intVar);

        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipos int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);

        long longVar = 9223372036854775807L;
        System.out.println("longVar = " + longVar);
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipos long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);
        
        var numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        
        var numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
    }

}
