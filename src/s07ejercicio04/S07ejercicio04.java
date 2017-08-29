/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un objeto tipo scanner
        Scanner input = new Scanner(System.in);
        //mostrando mensaje al usuario
        System.out.println("INGRESE NUMERO DE MINUTOS:");
        int minutes = input.nextInt();
        //calcular el numero de años y dias
        int years =  minutes / 525600;
        int days = (minutes % 525600)/1440;
        //mostrando resultado
        System.out.println(minutes + " minutos son aproximadamente" +  years + " años y " + days + " dias ");
    }
    
}
