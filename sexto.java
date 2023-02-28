// Imprimir por pantalla 1,2,3,4,5,6,7,8,9,10 con for, while y do-while.
public class sexto {
    public static void main(String args[]) {
        int i = 0;
        System.out.println("Serie con for: ");
        for(i=1;i<=10;i++) {
            if (i<10){
                System.out.println("los numeros con el for son: "+i);
            } else {
                System.out.println(i);
            }
        }
        i=1;
            //*****************************// 
        System.out.println("Serie con while: ");
        while(i<=10) {
            if (i<10){
            System.out.println("los numeros con el while son: "+i);
            } else {
                System.out.println(i);
            }
        i++;
        }
        i=1;
            //*****************************// 

        System.out.println("Serie con do-while: ");
        do {
            if (i<10){
            System.out.println("los numeros con el do-while son: "+i);
            } else {
                System.out.println(i);
            }
            i++;
        } while(i<=10);
    }
}
