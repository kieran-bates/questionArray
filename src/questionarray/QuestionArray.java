/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int alreadyAsked = 100;
        boolean exit = false;
        boolean correct;
        boolean repeatRegen = true;
        
        System.out.println("***MATH QUIZ***");
        System.out.println("\nPlease type your answer after the question. 11 to exit.");
        String [] questions = {"\nWhat is 1+1?", "What is 2+5?", "What is 3*2?", "What is 225*63", "What is 7*6?", "What is 3*7?", "What is 24-5?", "What is 30+11?", "What is 27-4?", "What is 255*276?"};
        String [] answers = {"2", "7", "6", "14175", "42", "21", "19", "41", "23", "70380"};
        
        while (exit == false)
        {
        randomInt = (int)(Math.random() * 9+1);
        
        if(randomInt == alreadyAsked)
        {
            while(repeatRegen == true)
            {
                randomInt = (int)(Math.random() * 9+1);
                if (randomInt == alreadyAsked)
                {
                    
                }
                if (randomInt != alreadyAsked)
                {
                    repeatRegen = false;
                }
            }
        }
        
        System.out.print("\n" + questions[randomInt] + " --> ");
        
        userAnswer = input.next();
        
        if(userAnswer.equals(answers[randomInt]))
        {
            correct = true;
            alreadyAsked = randomInt;
        }
        else
        {
            correct = false;
            alreadyAsked = randomInt;
        }
        
        if (correct == true)
        {
            System.out.println("Correct!");
            counter = counter + 1;
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
        }
    }
  }
}
