import java.util.Scanner;
public class ejercicio1 {


    static String convierteEnPalotes(int n){
        String cadena = String.valueOf(n);
        String palos = "";

        for (int i = 0; i < cadena.length(); i++) {
            int num = cadena.charAt(i) - 48;

            for (int j = 0; j < num; j++) {
                palos = palos + "|";
            }
            
            if (i < cadena.length()-1) {
                palos = palos + "-";
            }
        }
        return palos;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int n;

    System.out.println("Introduce un número:");
    n = entrada.nextInt();
    System.out.println("El número introducido cambiado a palos seria: " + convierteEnPalotes(n));

    }
}
