/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploclasseabstrata;

/**
 *
 * @author nando
 */
public class Circle extends Shape {
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    double getArea(){
        return(Math.PI * radius * radius);
    }
}
