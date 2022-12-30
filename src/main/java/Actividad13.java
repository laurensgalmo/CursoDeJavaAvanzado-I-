


/*
ACTIVIDAD13:
Dado un array de números de 5 posiciones con los siguientes valores {1,2,3,4,5},
guardar los valores de este array en otro array distinto, pero con los valores 
invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
*/

public class Actividad13 {

    public static void main(String[] args) {
        
        //Creamos dos arrays, una con valores y la otra vacía
        
        int[] arr = {1,2,3,4,5};
        
        int[] valorInvertido = new int[arr.length]; //Hay que tener en cuenta que debemos referenciar las 5 posiciones en esta array vacía
        
        //Recorremos la array de manera inversa, ponemos -1 para que sea del 5 al 1
        
        for(int i = arr.length - 1; i >= 0 ; i--){
             
            valorInvertido[i] = arr[i];
            
            System.out.print( valorInvertido[i]);
        }
    }
}
