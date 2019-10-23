/*
 * Kieran Bates
 * October 22, 2019
 * This program asks a user 10 math problems
 */

package questionarray;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;
public class QuestionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //New scanner for user input
        int randomInt; //Random int variable
        String userAnswer; //User answer string
        int counter = 1; //Program loop counter
        boolean exit = false; //Exit variable
        boolean correct; //Boolean that stores whether the answer is correct or incorrect
        
        System.out.println("***MATH QUIZ***"); //Print user prompts and store answers in arrays
        System.out.println("\nPlease type your answer after the question. 11 to exit.");
        String [] questions = {"\nWhat is 1+1?", "What is 2+5?", "What is 3*2?", "What is 225*63", "What is 7*6?", "What is 3*7?", "What is 24-5?", "What is 30+11?", "What is 27-4?", "What is 255*276?"};
        String [] answers = {"2", "7", "6", "14175", "42", "21", "19", "41", "23", "70380"};
        
        while (exit == false) //Repeat program until exit is true
        {
        randomInt = (int)(Math.random() * 9+1); //store a random int between 0 and 10 to randomInt
        
        System.out.print("\n" + questions[randomInt] + " --> "); //Prompt for user input
        
        userAnswer = input.next(); //Wait for next user input and store input
        
        if(userAnswer.equals(answers[randomInt])) //Is the answer correct?
        {
            correct = true; 
        }
        else //Is the answer incorrect?
        {
            correct = false;
        }
        
        if (correct == true) //If the answer is correct
        {
            System.out.println("Correct!"); //Print "Correct!" to the screen
            counter = counter + 1; //Advance question counter
        }
        if (counter == 10) //If 10 questions have been asked
        {
            exit = true;
        }
        if (userAnswer.equals("Exit")||userAnswer.equals("exit")) //If the user types exit
        {
            exit = true;
        }
        if (correct == false) //If the answer is incorrect
        {
            System.out.println("Incorrect!"); //Print "Incorrect!" to the screen
            counter = counter + 1; //Advance question counter
        }
    }
  }
}