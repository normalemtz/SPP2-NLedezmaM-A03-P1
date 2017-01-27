/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a03p1;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA03P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecl = new Scanner (System.in);
        System.out.println("Calculadora de hipotenusa de un triangulo rectángulo");
        
        //Variables
        Double a, b;//catetos
        Double c;// hipotenusa
        
       //valores
        System.out.println("Introducir cuanto mide el cateto a:");
        a = tecl.nextDouble();
        System.out.println("Introducir cuanto mide el cateto b:");
        b = tecl.nextDouble();
        
        //Operaciones
        //Se utiliza las funciones radicales de la clase Math para sacar raiz cuadrada y potencia
        c= Math.sqrt((Math.pow(a, 2))+ Math.pow(b,2) );
        
        //Resultado
        System.out.println("La hipotenusa es: " + c);
        
    }
    
}
