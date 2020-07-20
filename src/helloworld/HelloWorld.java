/*
    Student Name    :  Qi Cao
  
*/

package helloworld;

import java.util.Scanner;

public class HelloWorld
{

    public static void main(String[] args)
    {
        //start
        // initalization
        int number1 = 5;
        int number2 = 0;
        int age = 17;
        // class-object-work
        Scanner input = new Scanner(System.in);
        //***** sequence *****
        // user output to the screen
        System.out.println("Hello World");
        //input
        System.out.print("Enter your age: ");
        age=input.nextInt();
        System.out.println("The value of age is: " + age);
        // ***** if-then *****
        if (age > 20)
        {
            System.out.println("I can party!");
        }
        // ***** if-then-else *****
        if (age > 17)
        {
            System.out.println("I can vote!");
        } else
        {
            System.out.println("You not old enough to vote!");
        
        }
        // ***** loop *****
        while (number1>number2)
        {
            System.out.println("Number1: "+number1+" Number2: "+number2);
            number2= number2+1; //number2++; another way to increment a conuter
        }
        number2=0;
        //do loop example
        do
        {
            System.out.println("Number1: "+number1+" Number2: "+number2);
            number2++;
        }while(number1>number2);
        //for loop example
        for (number2=0; number1>number2;number2++)
        {
            System.out.println("for loop:"+ number2);
        }
        //stop
    }

}
