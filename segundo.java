// Plantee un ejercicio donde tenga que calcular el promedio de 3 numeros, y luego plantee otro libre donde tenga que ingresar alguno.
import java.util.Scanner;

public class segundo {
    public static void main (String args[]) {
        try (Scanner lector = new Scanner(System.in)) {
            double uno=9.6;
            int dos=9;
            int tres=4;
            
            double promedio;
            promedio=(uno+dos+tres)/3;
            
            if (promedio>=6) {
                System.out.println("el alumno aprobo con un promedio de: " + promedio);
            }
            else 
                System.out.println("el alumno reprobo con un promedio de: " + promedio );

            int numero=4;
            int numero_2=8;
            int numero_3=6;
            int resultado=0;
            int operacion;
            System.out.println("ingresa un numero: ");
            operacion=lector.nextInt();
            
            if (operacion==1) {
                resultado=numero+numero_2;
                System.out.println("el resultado es: " + resultado);
            } else if (operacion==2) {
                resultado=numero_2/numero;
                System.out.println("el resultado es:  "+resultado);
            }
            else
                System.out.println("el otro resultado es: " + (numero_3-numero_2));
        }
    }
}

