


/*
ACTIVIDAD 2:
Desarrollar un programa que muestre los números impares que hay del 1 al 100.
Para ello usaremos un bucle FOR.
*/

public class Actividad2 {

    public static void main(String[] args) {
       

      //Bucle FOR
      
      System.out.println("Los números impares que hay del 1 al 100 son: ");
      
      for(int i = 1; i <= 100 ; i++){
         
         if(i % 2 != 0){
  
             System.out.print(i + " ");
            }
      
        }
    }
    
}
    
