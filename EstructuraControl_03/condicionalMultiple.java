package ED_04.EstructuraControl_03;

import java.util.Scanner;

/*
 * Escribe un calificacion numerica (0-10) y que devuelva:
 * "Insuficiente" si la nota es menor de 5 
 * "Suficiente" si esta entre 5 y 6.9
 * "Bien" si esta entre 7 y 8.9
 * "Sobresaliente" si es 9 o superior
 */
public class condicionalMultiple {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);

        float nota; 

        System.out.println("Dime tu nota y te dire tu clasificacion: ");
        nota= Scanner.nextInt(); 

        if (nota<5) {
            System.out.println("Insuficiente");
        }else if (nota<=6.9) {
            System.out.println("Suficiente");
        }else if (nota<=8.9) {
            System.out.println("Bien");
        }else if (nota>9) {
            System.out.println("Sobresaliente");
        }

        Scanner.close();
    }
}
