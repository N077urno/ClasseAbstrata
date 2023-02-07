/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemploclasseabstrata;

/**
 *
 * @author nando
 */
public class ExemploClasseAbstrata {

    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape circle = new Circle(2);
        
        System.out.println("Area of square: "+square.getArea());
        System.out.println("Area of circle: "+circle.getArea());
    }
}
