package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String Name;
        int HeightFT, HeightIN;
        double HeightM;



        System.out.println("Hello!!! What is you name ?");
        Name=keyboard.nextLine();
        System.out.println("Hello "+Name+" I have some questions for you.");
        System.out.println("How tall are you in feet ?");
        HeightFT=keyboard.nextInt()*12;
        System.out.println("How tall are you in inches ?");
        HeightIN=keyboard.nextInt();
        HeightIN = HeightFT+HeightIN;
        HeightM = HeightIN * 0.025;






    }
}
