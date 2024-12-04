package ejercicio6;

import java.util.Scanner;
import ejercicio6.biblioteca.ArraysEnteros;//llamamos a la carpeta con los archivos
//se mecionan todas las carpetas separadas por puntos, cuando se llegue al archivo
//se escribe el nombre del archivo y a continuación el metodo que quieras utilizar
//la parte de añadir el metodo es dentro del main cuando los quieras usar

public class ProbarFunciones {

    // 6. Crea una biblioteca de funciones para arrays (de una dimensión) de números
    // enteros que contenga las
    // siguientes funciones:
    // ● generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
    // intervalo (mínimo
    // y máximo) se indica como parámetro.
    // ● minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
    // ● maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
    // ● mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
    // ● estaEnArrayInt: Dice si un número está o no dentro de un array.
    // ● posicionEnArray: Busca un número en un array y devuelve la posición (el
    // índice) en la que se
    // encuentra.
    // ● volteaArrayInt: Le da la vuelta a un array.
    // ● rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
    // array.
    // ● rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un
    // array.
    // Debes crear un programa que llame a las funciones para probar que funcionan.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

// Introducimos los valores
        System.out.println("Escribe cuantos números tendrá el array: ");
        int tamaño = entrada.nextInt();
        System.out.println("Escribe el valor mayor dentro del array: ");
        int mayor = entrada.nextInt();
        System.out.println("Escribe el valor menor dentro del array: ");
        int menor = entrada.nextInt();
        System.out.println("Introduce el valor que quieres buscar dentro del array: ");
        int numero = entrada.nextInt();

// guardamos el array generado
        int[] array2 = ejercicio6.biblioteca.ArraysEnteros.generaArrayInt(tamaño, mayor, menor);

// llamamos al metodo que hay dentro del archivo de la carpeta biblioteca
    System.out.println("El numero mayor del array es: " + ejercicio6.biblioteca.ArraysEnteros.maximoArrayInt(menor, array2));
    System.out.println("El numero menor del array es: " + ejercicio6.biblioteca.ArraysEnteros.minimoArrayInt(mayor, array2));
    System.out.println("La media del array es: " + ejercicio6.biblioteca.ArraysEnteros.mediaArrayInt(array2, tamaño));
    System.out.println(ejercicio6.biblioteca.ArraysEnteros.estaEnArrayInt(array2,numero));

// como pide buscar un numero, vamos a pedir que lo introduzca despues de imprimirle algunos
// ya que el array se rellena de forma aleatoria y no se conocen que numeros podría tener
// con exactitud
    System.out.println("Introduce el valor del que quieras saber su posicion en el array: ");
        int num_posicion=entrada.nextInt();

// llamamos al método e imprimimos por pantalla
    System.out.println("El valor se encuentra en la posicion "+ ejercicio6.biblioteca.ArraysEnteros.posicionEnArray(array2, num_posicion) + " del array");

// ahora vamos a escribir el array de forma inversa
        System.out.println("El array escrito de forma inversa sería:");
        int[] array_inversa = ejercicio6.biblioteca.ArraysEnteros.volteaArrayInt(array2, tamaño);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array_inversa[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

//vamos a rotar posiciones hacia la derecha
System.out.println("Escribe cuantas posiciones a la derecha quieres mover los números: ");
        int derecha= entrada.nextInt();
System.out.println("El array modificado a la derecha sería: ");
int[] array_derecha = ejercicio6.biblioteca.ArraysEnteros.rotaDerechaArrayInt(array2, derecha, tamaño);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array_derecha[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


 //vamos a rotar posiciones hacia la izquierda
System.out.println("Escribe cuantas posiciones a la izquierda quieres mover los números: ");
int izquierda= entrada.nextInt();
System.out.println("El array modificado a la izquierda sería: ");
int[] array_izquierda = ejercicio6.biblioteca.ArraysEnteros.rotaIzquierdaArrayInt(array2, derecha, tamaño);
for (int i = 0; i < array2.length; i++) {
    System.out.print(array_izquierda[i]);
    if (i < array2.length - 1) {
        System.out.print(", ");
    }
}
System.out.println();   





    }
}
