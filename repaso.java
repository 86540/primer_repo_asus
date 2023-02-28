public class repaso {
    public static void main(String args []) {

//EJERCICIO 1:
        int numero=5, numero_1=14;
        while (numero<=numero_1) {
            // todos numeros
            System.out.println("los numeros son: " +numero); // 1a)
            numero++;
        }
        for(numero=0;numero<=14;numero++) {
            //pares
            if(numero%2==0) {
                System.out.println(" el "+ numero + " es par"); //1 b)
            
            } else  //impares
                System.out.println(" el " + numero + " es impar "); // 1 c)
        }
        System.out.println("");
        for(numero=14;numero>=0;numero--) {
            if(numero%2==0) {
                System.out.println(" el "+ numero + " es par"); //1 d)
            }
        }
    }
}
