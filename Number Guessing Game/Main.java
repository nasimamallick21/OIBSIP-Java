//package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static  void main(String args[]){

            Scanner sc = new Scanner (System.in);
            int compNumber = (int)(Math.random()*100);
            System.out.println("Welcome to the game of Higher or Lower.");
            System.out.println("In this game you need to guess a number between 1 to 100 .");
            System.out.println("But you will have only 7 turns to reach towards the correct number.");
            int userNumber =0;
            int counter = 6;

            do{
                System.out.print("Choose a  number: ");
                userNumber =  sc.nextInt();

                System.out.println();

                int i = counter--;

                if (userNumber == compNumber) {
                    System.out.println("You guessed it right , You Win");
                    break;
                }

                else if(userNumber > compNumber) {
                    System.out.println("Your guess is higher than the right number, Turns left : " + i);
                    System.out.println("Try again entering a number lower than previous :"+ userNumber);
                    System.out.println( );
                }

                else {
                    System.out.println("Your guess is lower than right the number, Turns left : " + i);
                    System.out.println("Try again entering a number higher than previous :"+ userNumber);
                    System.out.println( );
                }

                if (counter<0){
                    System.out.println("Turns left is 0");
                    System.out.println("Computer Wins. The number was :"+ compNumber);
                    break;
                }


            }while (userNumber >=0 );


        }
    }

