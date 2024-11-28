import java.util.Scanner;
public class ejercicio2 {
    // 2. Crea una función con la siguiente cabecera:
    // public String convierteEnPalabras(int n)
    // Esta función convierte los dígitos del número n en las correspondientes
    // palabras y lo devuelve todo en
    // una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
    // cuatro, siete, cero, dos, uno, tres
    // Utiliza esta función en un programa para comprobar que funciona bien. Desde
    // la función no se debe
    // mostrar nada por pantalla, solo se debe usar print desde el programa
    // principal. Fíjate que hay una
    // coma detrás de cada palabra salvo al final.

    static String convierteEnPalabras(int n){
        //creamos un arraid para guardar como se escribe cada numero
        String[] nombres_numeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
            String cadena = String.valueOf(n);
            String nombres = "";
    
            for (int i = 0; i < cadena.length(); i++) {
                int posicion = cadena.charAt(i) - 48;
                nombres = nombres + nombres_numeros[posicion];//decimos que vaya añadiendo al valor nombres el string en esa celda del arraid

                if (i < cadena.length()-1) {//restamos 1 para que no añada una , extra al final
                 nombres = nombres + ", ";
                }
            }
        return nombres;
    }


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int n;

    System.out.println("Introduce un número:");
    n = entrada.nextInt();
    System.out.println("Los números en palabras serían: " + convierteEnPalabras(n));
    }
}
