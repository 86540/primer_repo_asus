// Imprimir por pantalla los numeros de esta manera: 1,99,2,98,3,97,4,96,5,95.
public class septimo {
    public static void main(String args[]) {
        int i=1, j=99;
        System.out.println("Serie con for: ");
        for (i=1; i<=5;i++){
            if (i<5) {
                System.out.print(i + " , " );
                System.out.print(j + " , " );
            } else {
                System.out.print(i + " , ");
                System.out.print(j);
            }
            j--;
        }
        System.out.println("");
        //*******************// 
        System.out.println("Serie con while");
        i=1;
        j=99;

        while(i<=5) {
            if(i<5) {
                System.out.print( i + " , ");
                System.out.print( j + " , ");
            } else {
                System.out.print( i + " , ");
                System.out.print(j);
            }
        j--;
        i++;
        }

        System.out.println("");
        //*******************// 
        System.out.println("Serie con do-while");
        i=1;
        j=99;
        do {
            if(i<5) {
                System.out.print( i + " , " );
                System.out.print( j + " , ");
            } else {
                System.out.print( i + " , " );
                System.out.print(j);
            }
            j--;
            i++;
        } while(i<=5);
       
    }
}
