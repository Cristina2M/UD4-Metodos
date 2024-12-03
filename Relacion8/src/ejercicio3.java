import java.util.Scanner;

public class ejercicio3 {
    // 3. Realiza un programa que pinte un triángulo relleno tal como se muestra en
    // los ejemplos. El usuario
    // debe introducir la altura de la figura. Usar una función para que la
    // implementación sea más sencilla.
    // Por ejemplo, se puede crear una función linea(char caracter, int
    // repeticiones)
    // que pinte una línea con el carácter especificado.

    static void triangulo (int altura){
        int resto=altura;//para restarle 1 y que cada vez escriba un * menos, añadimos otra variable
        for (int i = 0; i < altura; i++) {//hacemos bucle para el nº de lineas
            for (int j = resto; j > 0 ; j--) {//y este para el nº de *
                System.out.print("*");
            }
            resto=resto-1;//le quitamos 1 para que la proxima vex escriba 1 menos
            System.out.println();//y le añadimos un salto de linea
        }
    }
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la altura del triángulo");//pedimos la altura
        int altura=entrada.nextInt(); //guardamos el valor
        triangulo(altura);//invocamos el metodo
    }
}
