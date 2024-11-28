import java.util.Scanner;
public class ejercicio1 {


    static String convierteEnPalotes(int n){
        String cadena = String.valueOf(n);//funcion para que convierta un entero a cadena
        String palos = "";

        for (int i = 0; i < cadena.length(); i++) {
            int num = cadena.charAt(i) - 48;//se le resta 48 porque el valor que detecta en el 0 es 48 segun la tabla ASCI

            for (int j = 0; j < num; j++) {
                palos = palos + "|";
            }

            if (i < cadena.length()-1) {//se le resta 1 para que no añada un - de más
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
