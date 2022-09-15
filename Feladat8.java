package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg fej(0) vagy írás(1)");
        int a = sc.nextInt();

        int feldobas = (int)(Math.random() * 2);
        if (feldobas == a){
            System.out.println("Nyert");
        }
        else{
            System.out.println("nem nyert");
        }


    }
}
