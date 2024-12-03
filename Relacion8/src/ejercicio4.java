import java.util.Scanner;
public class ejercicio4 {
    // 4. Define la función convierteArrayEnString con la siguiente cabecera:
    // public static String convierteArrayEnString(int[] a)
    // Esta función toma como parámetro un array que contiene números y devuelve una
    // cadena de
    // caracteres con esos números. Por ejemplo, si a = { },
    // convierteArrayEnString(a) devuelve “”; si a = { 8 },
    // convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 },
    // convierteArrayEnString(a) devuelve
    // “62501”.


    static String convierteArrayEnString(int[] a){
        String numeros="";//declaro la variable donde voy a guardar los valores
            for (int i = 0; i < a.length; i++) {//hacemos un bucle for con el tamaño del array
                numeros= numeros + a[i]; //almaceno los valores de cada casilla
                //tambien se puede poner como -> numeros += a[i];
            }
            return numeros;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de valores que quieras en el array: ");
        int tamaño = entrada.nextInt();
        int[] a = new int[tamaño]; // inicio el array con el tamaño introducido
        System.out.println("Introduce el valor para cada casilla de tu array: ");

        for (int i = 0; i < tamaño; i++) {
            int num = entrada.nextInt();
            a[i] = num; //en el array a, en la casilla i, se introduce el valor
        }

        System.out.println("El numero sería: " + convierteArrayEnString(a));
    }
}
