/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length?");
        int length = in.nextInt();
        System.out.print("What is the width?");
        int width = in.nextInt();

        int area = length * width;
        int gallonofPaint = area / 350;

        if (area % 350 != 0) {
            gallonofPaint++;
        }

        System.out.println("You will need to purchase " + gallonofPaint + " gallon(s) of paint to cover " + area + " square feet.");
    }

}
