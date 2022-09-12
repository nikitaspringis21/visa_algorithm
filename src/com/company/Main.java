package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your card number: ");
        long cardNum = sc.nextLong();
        int sum = 0;
        char[] chars = ("" + cardNum).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int digit1 = (int)(cardNum % 100) / 10;
            int digit2 = (int)(cardNum % 100) % 10;

            if (digit1 * 2 < 9){
                sum += digit1 * 2;
            } else{
                sum += digit1 * 2 / 10;
                sum += digit1 * 2 % 10;
            }
            sum += digit2;

            cardNum /= 100;
        }
        if (sum % 10 == 0) {
            System.out.println("VISA");
        }else{
            System.out.println("INVALID");
        }
    }
}
