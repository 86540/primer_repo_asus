// Imprimir por pantalla: 0,1,1,2,3,5,8,13,21,34. Se lo conoce como sucesión Fibonacci.
public class octavo {
    public static void main (String args[]) {
        int a=0, b=1, c=0, i=0;
        System.out.println("La sucesion con For es la siguiente: ");
        for(i=0; i<10;i++) {
            if (i<9) {
                System.out.print(  a + " , " );
            } else {
                System.out.println(a);
            }
            c=a+b;
            a=b;
            b=c;
        }

        System.out.println("La sucesion con While es la siguiente: ");
        a=0;
        b=1;
        c=0;
        i=0;
        while (i<10) {
            if (i<9) {
                System.out.print( a + " , ");
            } else {
                System.out.println(a);
            }
            c=a+b;
            a=b;
            b=c;
        i++;
        }

        System.out.println("La sucesion con Do-While es la siguiente: ");

        a=0;
        b=1;
        c=0;
        i=0;
        do {
            if(i<9) {
                System.out.print( a + " , ");
            } else {
                System.out.println(a);
            }
            c=a+b;
            a=b;
            b=c;
        i++;
        } while (i<10);
    }
}