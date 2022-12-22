


/*
ACTIVIDAD 8:
Declara 2 variables numéricas (con el valor que desees).
Indica cual es mayor de los dos. Si son iguales indicarlo también.
Ve cambiando los valores, para comprobar que funciona.
*/

public class Actividad8 {

    public static void main(String[] args) {
        
        //Variables
        
        int var1 = 81;
        int var2 = 10;
        
        //Condicional IF
        
        if(var1 > var2){
            
            System.out.println("El número " + var1 + " es mayor que el número " + var2);
            
        }else if(var1 < var2){
            
            System.out.println("El número " + var1 + " es menor que el número " + var2);
    
        }else if(var1 == var2){
        
        System.out.println("El número " + var1 + " es igual que el número " + var2);
        }   
    }   
}
