// SWITCH, CASE AND DEFAULT
public class quinto {
    public static void main(String args[]) {
        int num=2, num_2=5, resultado=0;
        int parametro=2;

        switch(parametro) {
            case 1: resultado=num+num_2;
            System.out.println("el valor del resultado es: "+resultado);
            break;
            case 2: resultado=num*num_2;
            System.out.println("el valor del resultado es: "+resultado);
            break;
            case 3: resultado=num/num_2;
            System.out.println("el valor del resultado es: "+resultado);
            break;
            case 4: resultado=num-num_2;
            System.out.println("el valor del resultado es: "+resultado);

            default: System.out.println("no coincide con ninguno de los anteriores");
            break;
        }
    }
}
