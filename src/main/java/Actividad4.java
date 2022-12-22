import java.util.Scanner;


/*
ACTIVIDAD 4:
Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
Si no lo es, también debemos indicarlo.
*/

public class Actividad4 {

    public static void main(String[] args) {
        
        //Scanner
       
        Scanner scan = new Scanner(System.in);
        
        //Variable y pregunta por teclado
        
        System.out.println("Introduzca un número: ");
        
        int numero = scan.nextInt();

        //Condición IF
        
        if(numero % 2 == 0){
           
            System.out.println("El número " + numero + " es divisible entre 2.");
            
        }else{
            
            System.out.println("El numero " + numero + " NO es divisible entre 2.");
        }
    }    
}
