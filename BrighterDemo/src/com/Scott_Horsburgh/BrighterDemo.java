package com.Scott_Horsburgh;

import javax.swing.*;
import java.awt.*;

public class BrighterDemo {

    public static void main(String[] args) {

        /*-------------E2.8 & E2.9 for Chapter 2 --------------*/
        //creating new object using the Color class and initializing variables
        Color colors = new Color(50, 100, 150);
        int red = colors.getRed();
        int green = colors.getGreen();
        int blue = colors.getBlue();

        //Printing out default colors to terminal
        System.out.println("\n------Default color values------");
        System.out.println("Red: " + red + "\nGreen: " + green + "\nBlue: " + blue);

        //JFrame for default colors
        JFrame defaultColorBox = new JFrame();
        defaultColorBox.setSize(200,200);
        defaultColorBox.getContentPane().setBackground(colors);
        defaultColorBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        defaultColorBox.setVisible(true);

        //Changing the default color values to brighter/ higher values using brighter method
        colors = colors.brighter();

        //JFrame with updated brighter color values
        JFrame brighterColorBox = new JFrame();
        brighterColorBox.setSize(200,200);
        brighterColorBox.getContentPane().setBackground(colors);
        brighterColorBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        brighterColorBox.setVisible(true);

        //Printing out to the terminal new color values
        System.out.println("\n------Brighter color values------");
        System.out.println("Red: " + colors.getRed() + "\nGreen: " + colors.getGreen() + "\nBlue: " + colors.getBlue());

    }

}

