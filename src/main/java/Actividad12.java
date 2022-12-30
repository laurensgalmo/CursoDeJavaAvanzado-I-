
import java.util.Scanner;

/*
ACTIVIDAD 12:
Pide al usuario por teclado una frase y pasa sus caracteres a un array de
caracteres. Puedes hacer con o sin métodos de String.
*/
public class Actividad12 {

    public static void main(String[] args) {
       
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Variable
        
        System.out.println("Introduzca una frase: ");
        
        String frase = scan.nextLine();
        
        //Creamos un array de tipo char y hacemos una pequeña conversión
        
        char arr[] = frase.toCharArray();
        
        //Recorremos la frase ya convertida en array y la mostramos por consola
       
        for(int i = 0 ; i < arr.length ; i++){
            
            System.out.print(arr[i]);
        }
    }
}
