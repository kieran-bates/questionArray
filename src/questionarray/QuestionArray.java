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
        
        Scanner input = new Scanner(System.in);
        int randomInt;
        String userAnswer;
        int counter = 1;
        int counterRegen;
        int alreadyAskedCounter = 0;
        boolean repeatRegen;
        boolean exit = false;
        boolean correct;
        
        System.out.println("***MATH QUIZ***");
        System.out.println("\nPlease type your answer after the question. 11 to exit.");
        String [] questions = {"\nWhat is 1+1?", "What is 2+5?", "What is 3*2?", "What is 225*63", "What is 7*6?", "What is 3*7?", "What is 24-5?", "What is 30+11?", "What is 27-4?", "What is 255*276?"};
        String [] answers = {"2", "7", "6", "14175", "42", "21", "19", "41", "23", "70380"};
        int [] alreadyAsked = {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
        
        while (exit == false)
        {
        randomInt = (int)(Math.random() * 9+1);
        counterRegen = 1;
        repeatRegen = true;
        while(repeatRegen = true)
        {
            if(alreadyAsked[counterRegen] == randomInt || counterRegen == 10)
            {
                randomInt = (int)(Math.random() * 9+1);
                repeatRegen = false;
            }
            else
            {
                counterRegen = counterRegen+1;
            }
        }
        
        System.out.print("\n" + questions[randomInt] + " --> ");
        
        userAnswer = input.next();
        
        if(userAnswer.equals(answers[randomInt]))
        {
            correct = true;
        }
        else
        {
            correct = false;
        }
        
        if (correct == true)
        {
            System.out.println("Correct!");
            counter = counter + 1;
            alreadyAsked[alreadyAskedCounter] = randomInt;
            alreadyAskedCounter = alreadyAskedCounter+1;
        }
        if (counter == 10)
        {
            exit = true;
        }
        if (userAnswer.equals("Exit")||userAnswer.equals("exit"))
        {
            exit = true;
        }
        if (correct == false)
        {
            System.out.println("Incorrect!");
            counter = counter + 1;
            alreadyAsked[alreadyAskedCounter] = randomInt;
            alreadyAskedCounter = alreadyAskedCounter+1;
        }
    }
  }
}