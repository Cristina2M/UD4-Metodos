import java.util.Scanner;
public class ejercicio5 {
    // 5. Define la función concatena con la siguiente cabecera:
    // public static int[] concatena(int[] a, int[] b)
    // Esta función toma dos arrays como parámetros y devuelve un array que es el
    // resultado de concatenar
    // ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve
    // { 8, 9, 0, 1, 2, 3 }.


    static int[] concatena(int[] a, int[] b){
        int[] c= new int [a.length + b.length];//hacemos un 3º array que almacene a los dos

        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i <b.length; i++) {
            c[i+a.length]=b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //hacemos el array a
        System.out.println("Introduce la cantidad de valores que quieras en el primer array: ");
        int tamaño1 = entrada.nextInt();
        int[] a = new int[tamaño1]; // inicio el primer array con el tamaño introducido
        System.out.println("Introduce el valor para cada casilla de tu primer array: ");
        for (int i = 0; i < tamaño1; i++) {
            int num = entrada.nextInt();
            a[i] = num; //en el array a, en la casilla i, se introduce el valor
        }


        //hacemos el array b
        System.out.println("Introduce la cantidad de valores que quieras en el primer array: ");
        int tamaño2 = entrada.nextInt();
        int[] b = new int[tamaño2]; // inicio el segundo array con el tamaño introducido
        System.out.println("Introduce el valor para cada casilla de tu segundo array: ");
        for (int i = 0; i < tamaño2; i++) {
            int num2 = entrada.nextInt();
            b[i] = num2; //en el array b, en la casilla i, se introduce el valor
        }

        int[] d = concatena (a,b);
        //mostramos por pantalla el resultado, hay que imprimir casilla por casilla
        System.out.print("Concatenados serian: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
            if (i<d.length-1) {
                System.out.print(", ");
            }
            else{
                System.out.println();
            }
        }
        

    }
}        
    