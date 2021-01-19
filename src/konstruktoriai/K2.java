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
public class K2 extends K1 {
    private String vardas;
    
    public K2(String vardas) {
        // - jei pirma komanda !konstruktorius java kviecia: super();
        this.vardas = vardas;
    }
    
    public K2() {
        this("anonymous");
    }
            
    public void labas() {
        System.out.println("Labas" + this.vardas);
    }
    public void labas(int kiek) {
        for (int i = 0; i < kiek; i++) {
            
            
        System.out.println("Labas" + kiek + this.vardas);
        }
    }
    public void labas(String kreipenys, int kiek) {
        System.out.println("Labas" + kreipenys + this.vardas);
    }
    public void labas(int kiek, String kreipenys) {
        System.out.println("Labas" + kreipenys + this.vardas);
    }
    public void labas(String kreipenys) {
        System.out.println("Labas" + kreipenys + this.vardas);
    }
}
