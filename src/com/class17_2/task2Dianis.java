package com.class17_2;

import java.util.Scanner;

public class task2Dianis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double need = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("What do you wanna buy?");
        String item = in.nextLine();
        System.out.println("What is the price?");
        double price = in.nextDouble();
        System.out.println("Please pay for it.");
        double payment = in.nextDouble();
        for (double i = payment; i < price; i++) {
            need = price - payment;
            System.out.println("Sorry you need " + need + "$");
            System.out.println("Add more cash please");
            double more1 = in.nextDouble();
            payment += more1;
            if (payment == price) {
                break;
            }

        }
        System.out.println("Thank you for shopping!");
    }

	}


