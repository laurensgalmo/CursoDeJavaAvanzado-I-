


/*
ACTIVIDAD 7:
Muestra los números del 1 al 100 (ambos incluidos) divisibles por 2 o por 5.
Utiliza el bucle que desees.
*/
public class Actividad7 {

    public static void main(String[] args) {
       
        for(int i = 1; i <= 100 ; i++){
            
            if(i % 2 == 0 || i % 5 == 0){
                
                System.out.print(i + " ");
            }
        }
    } 
}
