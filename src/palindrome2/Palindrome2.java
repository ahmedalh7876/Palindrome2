/*
 * Author: Ahmed A.
 * Completion date: 24/2/2020
 * This program tests to see if a phrase is a palindrome.
 */
package palindrome2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Try statement to make sure program doesn't crash when invalid input is inserted.
        try {
            //Take input from user and store it as a string.
            String input = JOptionPane.showInputDialog("Please enter your phrase to check if it's a palindrome:");
            //Removes spaces from input to make comparing the original string to the backwards string easy.
            String inputWithoutSpaces = input.replace(" ", "");
            //Initiate backwards string as a null temporarily
            String backwards = "";
            //For loop to run as many times as there are letters or characters in the word.
            for (int i = 1; i <= inputWithoutSpaces.length(); i++) {
                //Makes the backwards string equal to the input string backwards.
                backwards += inputWithoutSpaces.charAt(inputWithoutSpaces.length() - i);
            }
            //Condition statement that tells user if the word is a palindrome or not.
            if (backwards.equalsIgnoreCase(inputWithoutSpaces)) {
                System.out.println("\"" + input + "\" is a palindrome");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome");
            }
        } catch (NullPointerException e) {
            //Exits system when cancel or X is pressed.
            System.exit(0);
        }

    }

}
