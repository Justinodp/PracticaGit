/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

import java.util.Scanner;

/**
 *
 * @author jdura
 */
public class PracticaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("ingres el radio");
            float r = sc.nextFloat();
            System.out.println("El área del circulo es " + Math.PI * Math.pow(r, 2));
            System.out.println("______________________");
            System.out.println("Presione -s para salir");
            String s = sc.nextLine();
            s = sc.nextLine();
            if (s.equals("-s"))
                break;
        } while (true);
        
    }
    
}
