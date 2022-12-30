


/*
ACTIVIDAD 11:
Crea un array de números de 100 posiciones, que contendrá los números del 1 al
100. Obtén la suma de todos ellos y la media.
*/

public class Actividad11 {

    public static void main(String[] args) {
     
    //tipodedato[] nombredelarray=new tipodedato[cantidad de datos a almacenar];
        
        int[] arr = new int[100];
        
        int suma = 0; 
        
        int media = 0; 
        
     //for
     
        for(int i = 0 ; i < arr.length ; i++){
            
            arr[i] = i + 1; //Recorre las cien posiciones, ponemos + 1 porque sinó suma hasta 99
            
            suma += arr[i]; //Obtención de la suma
  
        }
        
        System.out.println(suma);
        
        media = suma / 100; //Hacemos la media (la suma de los dígitos dividido entre el total de dígitos)
        
        System.out.println(media);         
    } 
}
    

