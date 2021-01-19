/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktoriai;

/**
 *
 * @author DanielMac
 */
public class Konstruktoriai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        K2 k = new K2();
        
       k.labas();
       k.labas(" kuku");
       k.labas(3, " yes");
       
       K3 k2 = new K3();
       Cup c = new Cup();
        
        System.out.println(" end");
    }
    
}
