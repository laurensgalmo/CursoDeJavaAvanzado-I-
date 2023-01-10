
import java.util.Scanner;

/*
ACTIVIDAD 19:
Crea un programa que pida una palabra por pantalla y le muestre al usuario una
debajo de otra las letras que forman esa palabra.
*/
public class Actividad19 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Pedir palabra
        
        System.out.println("Escriba una palabra: ");
        
        String palabra = scan.nextLine();
        char []  pal;
        pal = palabra.toCharArray();
        
        System.out.println("Las letras de la palabra: "); 
        
        //bucle FOR
        
        for(int i = 0 ; i < pal.length  ; i++){
            
           System.out.println(pal[i]);   
        }    
    }   
}
