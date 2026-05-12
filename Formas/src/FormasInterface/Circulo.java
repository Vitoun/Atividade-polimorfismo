/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasInterface;

/**
 *
 * @author Admin
 */
public class Circulo implements Formas {
    
    private double raio;
    
    public Circulo ( double raio){
     this.raio = raio;    
    }
    
    @Override
    public double calcularArea(){
        double area;
        double pi = 3.14;
        area = pi * raio * raio;
        return area;
    }
    
    
    
}
