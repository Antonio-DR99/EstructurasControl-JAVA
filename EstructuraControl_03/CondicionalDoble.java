package ED_04.EstructuraControl_03;
import java.util.Scanner;
/*
 * Escribe un programa que pida la edad de una persona y muesstre si
 *  es mayor o menor de edad
 */
public class CondicionalDoble {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in); 

        int age; 

        System.out.println("Dime tu edad y te dire si eres mayor o menor de edad");
        age=Scanner.nextInt(); 

        if (age>=18) {
            System.out.println("Eres mayor de edad");
            
        }else{
            System.out.println("Eres menor de edad");
        }

        Scanner.close();
    }
}
