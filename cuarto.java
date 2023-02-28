// Ejercicio: Utilizando nombre, clave y antiguedad averiguar
//Cuantos dias de vacaciones tiene: 
//Clave 1: Call center; Clave 2: Empresario; Clave 3: Jefes.
//Asignarle dias x de vacaciones.
import java.util.Scanner;
public class cuarto {
    public static void main(String args[]) {
        try (Scanner in = new Scanner (System.in)) {
            String nombre="";
            int clave, año_antiguedad;

            System.out.println("¿cual es tu nombre?");
            nombre = ((Scanner) in).nextLine();

            System.out.println("dame tus años de antiguedad: ");
            año_antiguedad=((Scanner) in).nextInt();

        do  {
            System.out.println("dame clave menor o igual a 3: ");
            clave=((Scanner) in).nextInt();

            if (clave==1 && año_antiguedad<=1) {
                System.out.println("tenes 6 dias de vacaciones");
            } else if (clave==1 && año_antiguedad>=2 && año_antiguedad<=6) {
                System.out.println("tenes 14 dias de vacaciones");
            } else if (clave==1 && año_antiguedad>7){ 
                System.out.println("tenes 20 dias de vacaciones");
            }
            if (clave==2 && año_antiguedad<=1) {
                System.out.println("tenes 7 dias de vacaciones");
            } else if(clave==2 && año_antiguedad>=2 && año_antiguedad<=6) {
                System.out.println("tenes 15 dias de vacaciones");
            } else if (clave==2 && año_antiguedad>7) {
                System.out.println("tenes 22 dias de vacaciones");
            }
            
            if (clave==3 && año_antiguedad<=1) {
                System.out.println("tenes 10 dias de vacaciones");
            } else if (clave==3 && año_antiguedad<=6) {
                System.out.println("tenes 20 dias de vacaciones"); 
            } else if (clave==3 && año_antiguedad>7) {
                System.out.println("tenes 30 dias de vacaciones");
                }
            } while( (clave<4));

        }
    }
} 