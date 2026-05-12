/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formasAbstract;

/**
 *
 * @author Admin
 */
public class FormasTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormasAbstract r1 = new Retangulo(6, 45);
        FormasAbstract c1 = new Circulo(8);    
        
        System.out.println("Area do retangulo: " + r1.calcularArea());
        System.out.println("Area do circulo: " +  c1.calcularArea());
        
    }
    }
    

