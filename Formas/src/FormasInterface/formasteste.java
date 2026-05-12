/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasInterface;

/**
 *
 * @author Admin
 */
public class formasteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Formas r1 = new Retangulo(10.5, 15);
        Formas c1 = new Circulo(5);    
        
        System.out.println("Area do retangulo: " + r1.calcularArea());
        System.out.println("Area do circulo: " +  c1.calcularArea());
        
    }
    
}

