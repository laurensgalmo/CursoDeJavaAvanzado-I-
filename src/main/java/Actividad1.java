
import java.util.Scanner;

    
/*
ACTIVIDAD 1:
Desarrollar un programa que nos solicite un numero por teclado y nos indique si 
es múltiplo de 5. Para ello usaremos la estructura de control IF.
*/

public class Actividad1 {

   
    public static void main(String[] args) {
    
    //Scanner
    
    Scanner scan = new Scanner(System.in);

    //Variable
    
    System.out.println("Introduzca un número: ");
    int numero = scan.nextInt();
    
    //Condicional IF
    
    if(numero % 5 == 0){
        
        System.out.println(numero + " es mútliplo de 5");
        
    }else{
        
         System.out.println(numero + " NO es mútliplo de 5");
    }   
}
    
}
