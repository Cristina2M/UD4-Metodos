package ejercicio6.biblioteca;

public class ArraysEnteros {

//● generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo 
//(mínimo y máximo) se indica como parámetro.
    public static int[] generaArrayInt(int tamaño, int mayor, int menor){
        int[] array= new int [tamaño];
        for (int i = 0; i < tamaño; i++) {
           array[i]=((int) (Math.random()*(mayor-menor))+menor);
        }
        return array;
    }
        
//● minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
    public static int minimoArrayInt(int mayor, int[] array){
        int comparacion=mayor;
        int pequeño=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<comparacion) {
                pequeño=array[i];
                comparacion=pequeño;
            }
        }
        return pequeño;
    }
    

//● maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
    public static int maximoArrayInt(int menor, int[] array){
        int comparacion=menor;
        int grande=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>comparacion) {
                grande=array[i];
                comparacion=grande;
            }
        }
        return grande;
    }

//● mediaArrayInt: Devuelve la media del array que se pasa como parámetro.

    public static int mediaArrayInt(int [] array, int tamaño){
        int media;
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma= suma + array[i];
        }
        media= suma/tamaño;
        return media;
    }


//● estaEnArrayInt: Dice si un número está o no dentro de un array.
    public static String estaEnArrayInt(int[] array, int numero){
        String respuesta;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==numero) {
                return respuesta= "El número introducido si está dentro del array.";
            }
        }
        return respuesta= "El numero introducido no está dentro del array";
    }


//● posicionEnArray: Busca un número en un array y devuelve la posición (el índice) 
//en la que se encuentra.

public static int posicionEnArray(int[] array, int num_posicion){
    int j=00000000;
    for (int i = 0; i < array.length; i++) {
        if (array[i]==num_posicion) {
            j=i+1;
        }
    }
    return j;
}



//● volteaArrayInt: Le da la vuelta a un array.

public static int[] volteaArrayInt(int[] array, int tamaño){
    int[] array2 = new int[tamaño];
    int inversa= tamaño-1;
    for (int i = 0; i < array.length; i++) {
        array2[i]=array[inversa];
        inversa--;
    }

    return array2;
}


//● rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
    public static int[] rotaDerechaArrayInt(int[] array, int derecha, int tamaño){
        int[] array3= new int [tamaño];
        int posicion=derecha;
        for (int i = 0; i < array.length; i++) {
            array3[posicion]=array[i];
            posicion++;
            if (posicion==array.length) {
                for (int j = 0; j < derecha; j++) {
                    array3[j]=array[i+1];
                    i++;
                }
            }
        }
        return array3;
    }

//● rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
public static int[] rotaIzquierdaArrayInt(int[] array, int izquierda, int tamaño){
    int[] array4= new int [tamaño];
    int posicion=izquierda;
    for (int i = 0; i < array.length; i++) {
        array4[i]=array[posicion];
        posicion++;
        if (posicion==array.length) {
            for (int j = 0; j < izquierda; j++) {
                array4[i+1]=array[j];
                i++;
            }
        }
    }
    return array4;
}

}
