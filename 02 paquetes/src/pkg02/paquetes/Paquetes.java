/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.paquetes;
import java.util.Scanner;
import javax.swing.JOptionPane;
import matematicas.Matematicas;

/**
 *
 * @author me.horta
 */
public class Paquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a,b;
        String expresion="";
       
        a =Float.parseFloat(JOptionPane.showInputDialog("Introduce numero 1"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Introduce numero 2"));
        expresion = JOptionPane.showInputDialog("Elige la operacion a ejecutar \n a. Suma\n b. Resta \n c. Multiplicación\n d. División\n e.Salir");
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + mat.suma(a,b)+"\n" +
                "El resultado de la multiplicación es: " + mat.multiplicacion(a, b)+ "\n"+ "El resultado de la resta es: "+ mat.resta(a,b)+
                "\n"+ "El resultado de la división es: "+ mat.division(a, b));

        System.out.println("Resultado:"+ mat.suma(a, b));
    }
    
}
