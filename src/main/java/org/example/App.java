/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.print("What is the input string? ");
        String string = input.next();
        System.out.println( string + " has " + string.length() + " characters.");
    }
}
