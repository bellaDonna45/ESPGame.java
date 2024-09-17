/*
 * Class: CMSC203 
 * Instructor: Aygun
 * Description: Chooses random number to choose random color which user guesses and counts the right vs wrong.
 * Due: 9/16/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Jade Belinga
*/


package esppackage;
import java.io.*;
import java.util.*;

public class ESPGame {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int right = 0;
        String color = "";
        final String COLOR_BLACK = "black";  
        final String COLOR_WHITE = "white";  
        final String COLOR_GRAY = "gray";  
        final String COLOR_SILVER = "silver";
        final String COLOR_MAROON = "maroon";
        final String COLOR_RED = "red";
        final String COLOR_PURPLE = "purple";
        final String COLOR_FUCHSIA = "fuchsia";
        final String COLOR_GREEN = "green";
        final String COLOR_LIME = "lime";
        final String COLOR_OLIVE = "olive";
        final String COLOR_YELLOW = "yellow";
        final String COLOR_NAVY = "navy";
        final String COLOR_BLUE = "blue";
        final String COLOR_TEAL = "teal";
        final String COLOR_AQUA = "aqua";
        File file = new File("/Users/jadebelinga/Downloads/CMSC/colors.txt");
      

        System.out.print("Enter the file name: ");
        sc.next();
        System.out.println("There are sixteen colors from a file: ");
        
        Scanner scFile = new Scanner(file);
        for (int i = 0; i < 16; i++)
        {
                System.out.println(scFile.nextLine());
                
        }
        
       
		

        
        
        for (int j = 1; j <= 3; j++) {
                
            switch (rand.nextInt(16) + 1) {
            
            case 1: color = COLOR_BLACK;
            	break;
            case 2: color = COLOR_WHITE;
            	break;
            case 3: color = COLOR_GRAY;
            	break;
            case 4: color = COLOR_SILVER;
            	break;
            case 5: color = COLOR_MAROON;
            	break;
            case 6: color = COLOR_RED;
            	break;
            case 7: color = COLOR_PURPLE;
            	break;
            case 8: color = COLOR_FUCHSIA;
            	break;
            case 9: color = COLOR_GREEN;
            	break;
            case 10: color = COLOR_LIME;
            	break;
            case 11: color = COLOR_OLIVE;
            	break;
            case 12: color = COLOR_YELLOW;
            	break;
            case 13: color = COLOR_NAVY;
            	break;
            case 14: color = COLOR_BLUE;
            	break;
            case 15: color = COLOR_TEAL;
            	break;
            case 16: color = COLOR_AQUA;
            	
            		
            }
                

            System.out.print("\nRound " + j + "\nI am thinking of a color.\nIs it one of the listed colors above?\nEnter your guess: ");
            String guess = sc.nextLine();
            sc.next();

            if (guess.equals(color)) {
                System.out.println("I was thinking of " + color + ".");
                right++;
            } else {
                System.out.println("I was thinking of " + color + ".");
            }
        
        }
        System.out.print("\nGame Over\nYou guessed right " + right + " out of 3 times.");

        
        
        System.out.print("\n\nEnter your name: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        

        System.out.print("Describe yourself: ");
        String desc = sc.nextLine();
        

        System.out.print("Enter the due date: ");
        String due = sc.nextLine();
        
        
        // Display collected information
        System.out.println("\nName: " + name);
        System.out.println("Description: " + desc);
        System.out.println("Due Date: " + due);

    }
}


