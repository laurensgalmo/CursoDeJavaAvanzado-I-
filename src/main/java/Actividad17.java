import java.util.Scanner;


/*
ACTIVIDAD 17:
Programa que tome tres números y diga:
Si el tercer número es igual a la multiplicación de los 2 primeros.
Si el tercer número es igual a la división de los 2 primeros.
Si el tercer número es igual al módulo de los 2 primeros.
*/

public class Actividad17 {

    public static void main(String[] args) {
        
        //Scanner
        Scanner scan = new Scanner(System.in);
        
        //Array
        
        int [] arr = new int [3];
        
        //Bucle for
        
        for(int i = 0 ; i < arr.length ; i++){
        
        //Introducir número por consola 
        
        System.out.println("Introduzca un número al azar: ");
        arr[i] = scan.nextInt();

        }
       
        if(arr[2] == (arr[0] * arr[1])){
            
        System.out.println("El tercer número es igual a la multiplicación de los 2 primeros");
        
        }else{
           System.out.println("El tercer número NO es igual a la multiplicación de los 2 primeros"); 
        }
        
        if(arr[2] == (arr[0] / arr[1])){
        
            System.out.println("El tercer número es igual a la división de los 2 primeros");
         
        }else{
            System.out.println("El tercer número NO es igual a la multiplicación de los 2 primeros");
        }
        
        if(arr[2] == (arr[0] % arr[1])){
        
            System.out.println("El tercer número es igual al módulo de los 2 primeros");
         
        }else{
            System.out.println("El tercer número NO es igual a la multiplicación de los 2 primeros");
        }
    }
}
