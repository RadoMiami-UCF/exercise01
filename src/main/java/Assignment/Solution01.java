package Assignment;

import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 1 Solution
         *  Copyright 2021 Kimari Guthre
         */
        /* Make a scanner,
        then ask name,
        then create variable for name and store it,
        and combine string
        and greet! */
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        String lastString = "Hello, " + name + ", nice to meet you!";
        System.out.println(lastString);
    }
}
