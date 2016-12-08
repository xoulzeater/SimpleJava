/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejava;

/**
 *
 * @author User
 */
public class SimpleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 2, c = 1;
        if (a > c) {
            a = b = c = 1;

            System.out.println(a);
        }
    }

}
