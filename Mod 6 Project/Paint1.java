//package Mod6;
//Crystal Frye 

import java.util.Scanner;
import java.util.InputMismatchException;

//possibly need streams
//fix do while loops 

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        boolean needInput = true;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        //System.out.println("Enter wall height (feet): ");
        //wallHeight = scnr.nextDouble();
    try {   
        do {        	
        	System.out.println("Enter wall height (feet): ");
        	wallHeight = scnr.nextDouble();
        	if (wallHeight <= 0) {
        		System.out.println("Invalid height");
        	}
        	else {
        		needInput = false;
        	}
        } while (needInput == true); ///fix 
   		}
    catch (InputMismatchException e) {
    	System.out.println("Enter wall height (feet): ");
    	scnr.nextDouble();
    }
    
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width

        try {   
            do {        	
            	System.out.println("Enter wall width (feet): ");
            	wallWidth = scnr.nextDouble();
            	if (wallWidth <= 0) {
            		System.out.println("Invalid width");
            		needInput = true;
            	}
            	else {
                    // Calculate and output wall area
                    wallArea = wallHeight * wallWidth;
                    System.out.println("Wall area:  " + wallArea + " square feet"); // fixed print statement
            		
                    // Calculate and output the amount of paint (in gallons) needed to paint the wall
                    gallonsPaintNeeded = wallArea/squareFeetPerGallons;
                    System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons"); // fixed the gallonsPaintNeeded variable
                    needInput = false;
            	}
            } while (needInput == true); ///fix 
       		}
        catch (InputMismatchException e) {
        	needInput = true;
        }
    }
}
