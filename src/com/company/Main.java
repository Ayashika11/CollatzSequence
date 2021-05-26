package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    number=sc.nextInt();
    if(number<=0) {
        System.out.println("Please enter a positive integer");
        return;
    }
    System.out.println(number);
    while(number!=1) {
        if(number%2==0)
             number/=2;
        else
            number=(3*number)+1;
        System.out.println(number);
        }
    }
}
