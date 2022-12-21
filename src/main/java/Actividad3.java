
import java.util.Scanner;

/*
ACTIVIDAD 3:
Desarrollar un programa que nos solicite un número por teclado y compruebe que 
este número es mayor que cero. Si el número no es mayor que 0, indica el mensaje
“El número es incorrecto” y se volverá a solicitar de nuevo, pero si el número
es mayor que cero indicará el mensaje “El número es correcto” y no volverá a 
solicitar un numero. Para ello usaremos dos tipos de estructuras de control;
un IF dentro de un Do While.
*/

public class Actividad3 {

    public static void main(String[] args) {

        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Variables
        
        System.out.println("Introduzca un número: "); 
        int numero = scan.nextInt();
        
        //Condicional IF y bucle Do While
        
     do{
       
         if(numero < 0){

             System.out.println("El número es incorrecto, vuelva a introducir número :D");
             numero = scan.nextInt();
            }
        
        }while(numero < 0);

        System.out.println("El número es correcto");
    }
       
}
