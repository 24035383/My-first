/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.currencyconversion;

/**
 *
 * @author Tsheg
 */
import javax.swing.JOptionPane;

public class Input {
    public static void main(String[] args){
     
        String name;
        name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello," +name+ "!");
    
    }
}
