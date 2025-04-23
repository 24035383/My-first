/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Tsheg
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        // Declare variables:
        // a is for the length and b is the breadth of the rectangle.
        
        double a, b;
        double Area;
        double Perimeter;
        
        // Process
        a = 5;
        b = 2;
        Area = a*b;
        
        // The formula for a perimeter is given by adding all known sides of the shape.
        Perimeter = 2*a + 2*b;
        
        // print out the Area.
        System.out.println("The Area is:" +Area);
        
        // print out the Perimeter.
        System.out.println("The Area is:" +Perimeter);
    }
}
