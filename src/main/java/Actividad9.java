import java.util.Scanner;


/*
ACTIVIDAD 9:
Lee un número por teclado y comprueba que este número es mayor o igual que
cero, si no lo es lo volverá a pedir (do while ), después muestra ese número
por consola.
*/

public class Actividad9 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Variables
        
        System.out.println("Introduzca un número: ");

        int numero = scan.nextInt();
        
        //Bucle DO WHILE
        
        do{
            if(numero <= 0){
            
            System.out.println("Introduzca un número nuevo: ");
            numero = scan.nextInt();  
            }
        }while(numero <= 0);
        
        System.out.println("Número " + numero + " correcto.");
    } 
}
