/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploclasseabstrata;

/**
 *
 * @author nando
 */
public class Square extends Shape {
    double sideLength;
    
    Square(double sideLength){
        this.sideLength = sideLength;
    }
    
    @Override
    double getArea(){
        return(sideLength*sideLength);
    }
}
