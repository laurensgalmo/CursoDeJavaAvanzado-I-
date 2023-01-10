import java.util.Scanner;
import java.util.Arrays;


/*
ACTIVIDAD 16:
Programa que tome 6 números y los muestre en pantalla de menor a mayor:
Primero se muestre el menor de los 6.
Después se muestre el mayor de los 6.
Después se muestren los 6 números ordenados de menor a mayor.
Después se muestren los 6 números ordenados de mayor a menor.
*/

public class Actividad16 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Para guardar los números necesitamos un array
        
        int [] numeros = new int [6];
        
        
        for(int i = 0; i < numeros.length ; i++){
       
            System.out.println("Introduzca número al azar: ");
            numeros[i] = scan.nextInt();
        }
        
        Arrays.sort(numeros);
     
        
        System.out.println("El número menor es: " + numeros[0]);
        System.out.println("El número mayor es: " + numeros[numeros.length -1]);
        System.out.print("Su orden de menor a mayor: ");

        for(int a = 0 ; a < numeros.length ; a++){
            
            System.out.print(numeros[a] + " ");
        }

        System.out.print("\nSu orden de mayor a menor: " );
        
        
        for(int b = numeros.length -1 ; b >= 0 ; b--){
            
            System.out.print(numeros[b] + " ");
        }
    }
}
