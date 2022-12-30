
import java.util.Scanner;

/*
ACTIVIDAD 10:
Crea una aplicación que nos pida un día de la semana y que nos diga si es un día
laboral o no. Usa un switch para ello.
*/

public class Actividad10 {

    public static void main(String[] args) {
    
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Variable
        
        System.out.println("Introduzca un día de la semana: ");
        
        int diaSemana = scan.nextInt();
        
        //Switch
        
        switch (diaSemana) {
            
            case 1 :
            System.out.println("Lunes es día laboral"); 
            break;
            
            case 2 :
            System.out.println("Martes es día laboral"); 
            break;
            
            case 3 :
            System.out.println("Miércoles es día laboral"); 
            break;
            
            case 4 :
            System.out.println("Jueves es día laboral"); 
            break;
            
            case 5 :
            System.out.println("Viernes es día laboral"); 
            break;
            
            case 6 :
            System.out.println("Sábado es festivo"); 
            break;
            
            
            case 7 :
            System.out.println("Domingo es festivo"); 
            break;
            
            default:
                throw new AssertionError();
        }
    }
}
