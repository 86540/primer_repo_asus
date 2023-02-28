import java.util.Scanner;
public class Tercero {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String nombre="";
            int num_1, num_2, resultado=0;

            System.out.println("¿cual es tu nombre?");
            nombre=in.nextLine(); //texto

            System.out.println("dame el primer valor");
            num_1=in.nextInt(); // enteros

            System.out.println("dame el segundo valor");
            num_2=in.nextInt(); // enteros

            resultado=num_1+num_2;

            System.out.println("Hola me llamo "+ nombre +" el resultado es: " +resultado);
        }
        }
}

