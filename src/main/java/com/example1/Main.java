/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Neet
 */
package com.example1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");

        String name = input.nextLine();
        System.out.println("Hello, "+name+", nice to meet you!");
    }
}
