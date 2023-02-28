// Ejercicio monotributo. Ingresar ingreso, superficie e energía de cada trabajador y asignar en que categoria quedará. Ir probando con distintas variables y valores.
import java.util.Scanner;
public class repaso_2 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            float ingresos=2000002;
            int superficie = 200;
            int energia = 90000;

            System.out.println("dame tu ingreso: ");
            ingresos=in.nextFloat();

            System.out.println("Dame tu superficie");
            superficie=((Scanner) in).nextInt();

            System.out.println("energia consumida: ");
            energia=((Scanner) in).nextInt();
                /*********************************************/
            if ( (ingresos <= 748382.07) &&
            ( superficie <= 30) &&
            (energia <= 3330) ) {
            System.out.println("Categoría A");
            } else if((ingresos <= 1112459.83) &&
            (superficie <= 45) &&
            (energia <= 5000) ) {
            System.out.println("Categoría B");
            }

            else if(( ingresos<=1500000)&&
            (superficie<=60)&&
            (energia<=7000)) {
            System.out.println("Categoria C");
                
            } else if(( ingresos<=2000000)&&
            (superficie<=100)&&
            (energia<=10000)) {
            System.out.println("Categoria D");
                
            } else if ((ingresos>2000001)&&
            (superficie>101)&&
            (energia>10001)) {
            System.out.println("Categoria D");
            }
        }
    }        
}
