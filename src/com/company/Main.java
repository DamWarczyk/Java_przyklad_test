package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int wybor;
        System.out.print("Podaj x i y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("1. Dodawnie " +
                "2. Odejmowanie " +
                "3. Mnozenie " +
                "4. Dzielenie " +
                "5. Potegownie " +
                "6. Pierwiastkowanie ");
        wybor = sc.nextInt();
        switch (wybor){
            case 1:
                System.out.println(dodawnie(x,y));
            break;
            case 2:
                System.out.println(odejnowanie(x,y));
                break;
            case 3:
                System.out.println(mnozenie(x,y));
            break;
            case 4:
                dzielenie(x,y);
                break;
            case 5:
                System.out.println(potegowanie(x,y));
                break;
        }
    }
    public static int dodawnie(int x, int y){
       return x+y;
    }

    public static int odejnowanie(int x, int y){
        return x-y;
    }

    public static int mnozenie(int x, int y){
        return x*y;
    }

//    public static int blad(int y){
//        Scanner skaner = new Scanner(System.in);
//        while (true) {
//            y = skaner.nextInt();
//        return y;
//        }
//        }

    public static void dzielenie (int x, int y){
        Scanner skaner = new Scanner(System.in);
        try {
            System.out.println("Wynik dzielenia: " + x/y);
        }
        catch (ArithmeticException e){
            System.err.println("Nie dziel cholero przez zero: ");
            y = skaner.nextInt();
            dzielenie(x,y);
        }
        catch (InputMismatchException e){
            System.err.println("Nie dziel cholero przez zero: ");
            y = skaner.nextInt();
            dzielenie(x, y);
        }
    }

    public static int potegowanie(int x, int y){
    return (int) Math.pow(x, y);
    }

    public static void pierwiastkowanie(int x, int y){
        Scanner skaner = new Scanner(System.in);
        try {
            if (x < 0)
                throw new ArithmeticException("Podaj nie ujemną wartość");
            else
                System.out.println(Math.sqrt(x));
        }
        catch (ArithmeticException e){
            x = skaner.nextInt();
            pierwiastkowanie(x, y);
        }
    }

}

