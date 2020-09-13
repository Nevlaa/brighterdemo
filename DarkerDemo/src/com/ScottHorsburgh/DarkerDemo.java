package com.ScottHorsburgh;

import javax.swing.*;
import java.awt.*;

public class DarkerDemo {

    public static void main(String[] args) {
        //creating new object using the Color class and initializing variables
        Color defaultColors = new Color(50, 100, 150);
        int red =  defaultColors .getRed();
        int green =  defaultColors .getGreen();
        int blue =  defaultColors .getBlue();

        //Printing out default colors to terminal
        System.out.println("\n------Default color values------");
        System.out.println("Red: " + red + "\nGreen: " + green + "\nBlue: " + blue);

        //JFrame for default colors
        JFrame defaultColorBox = new JFrame();
        defaultColorBox.setSize(300,300);
        defaultColorBox.getContentPane().setBackground( defaultColors );
        defaultColorBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        defaultColorBox.setVisible(true);

        //Changing the default red value to a darker or lower value red using darker method
        Color darkerRed = new Color( red,  0, 0);
        darkerRed =  darkerRed.darker();
        //System.out.println("\nRed value 1: " +  darkerColors);
        darkerRed =  darkerRed.darker();
        //System.out.println("Red value 2: " +  darkerColors);

        //Creating a new object with new values for arguments
        Color newColors = new Color(darkerRed.getRed(),green,blue);

        //Printing out to the terminal new color values
        System.out.println("\n------Darker color values------");
        System.out.println("Red value: " + darkerRed.getRed());
        System.out.println("Green value: " + defaultColors.getGreen());
        System.out.println("Blue value: " + defaultColors.getBlue());

        //JFrame with updated darker red value
        JFrame brighterColorBox = new JFrame();
        brighterColorBox.setSize(300,300);
        brighterColorBox.getContentPane().setBackground(newColors);
        brighterColorBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        brighterColorBox.setVisible(true);

    }
}
