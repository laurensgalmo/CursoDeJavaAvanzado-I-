


/*
ACTIVIDAD 15:
Crea un programa Java que calcule si un número es múltiplo de 10.
*/

public class Actividad15 {

    public static void main(String[] args) {
        
        //VARIABLE
        
        int numero = 10;
        
        //CONDICIONAL IF
        
        if(numero %10 == 0){
            System.out.println("El número " + numero + " es múltiplo de 10"); 
        }else{
           System.out.println("El número " + numero + " NO es múltiplo de 10");  
        }    
    } 
}
