package ED_04.EstructuraControl_03;
import java.util.Scanner;
/*
 * Escribe un programa que pida un numero y determina si es par o impar 
 * Muestra el mensaje correspondiente en cada caso
 */
public class CondicionalSimple {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);

        int num; 

        System.out.println("Dime un numero y te dire si es par o impar: ");
        num= Scanner.nextInt();

        if (num%2==0) {
            System.out.println("El numero: "+num+" es par");
            
        }else{
            System.out.println("El numero: "+num+" es impar");
        }

        Scanner.close();
    }
    
}
