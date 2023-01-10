
import java.util.Scanner;

/*
ACTIVIDAD 18:
Programa que muestre un menú para pasar de Kg a otra unidad. Pedir un valor
en Kg y mostrar por pantalla ese valor pasado a la unidad que el usuario haya 
seleccionado previamente. Las unidades del menú son: hectogramos, decagramos, 
gramos, decigramos,centigramos, miligramos.
*/

public class Actividad18 {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);    
        
        //Pedir valor en KG
        
        System.out.println("[ MENÚ PARA PASAR DE KG A LA UNIDAD DESEADA ]\n");
        
        System.out.println("Introduzca un valor: ");
        
        int unidad = scan.nextInt();
        
        //Menú
        
        System.out.println("[ PULSE 1 ] para hectogramos");
        System.out.println("[ PULSE 2 ] para decagramos");
        System.out.println("[ PULSE 3 ] para gramos");
        System.out.println("[ PULSE 4 ] para decigramos ");
        System.out.println("[ PULSE 5 ] para centigramos");
        System.out.println("[ PULSE 6 ] para miligramos"); 
        
        int unidadCambiada = scan.nextInt();
              
        //SWITCH
        
        switch (unidadCambiada){
        
            case 1 :
            System.out.println("El valor " + unidad + "KG, equivale a " + unidad * 10 + "HG");
            break;
            case 2 :
            System.out.println("El valor " + unidad + "KG, equivale a " + unidad * 100 + "DG");
            break;
            case 3 :
            System.out.println("El valor " + unidad + "KG, equivale a " + unidad * 1000 + "G");
            break;
            case 4 :
            System.out.println("El valor " + unidad + "KG, equivale a " + unidad * 10000 + "CG");
            break;
            case 5 :
            System.out.println("El valor " + unidad + "KG, equivale a " + unidad * 100000 + "CG");;
            break;
            case 6 :
            System.out.println("El valor " + unidad + "KG, equivale a " + unidad * 1000000 + "CG");
            break;
        } 
    } 
}

