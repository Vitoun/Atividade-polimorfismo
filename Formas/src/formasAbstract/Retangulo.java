/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formasAbstract;

/**
 *
 * @author Admin
 */
public class Retangulo extends FormasAbstract {
    private double base; 
   private double altura;
    
   public Retangulo (double base, double altura ){
       this.base = base;
       this.altura = altura;
       
   }
   
   @Override 
   public double calcularArea(){
       double area;
       area = base * altura;
       return area;
   }
}
