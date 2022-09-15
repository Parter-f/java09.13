package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        System.out.println("Kérem adjon meg egy számot");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            if (a%2 != 0){
                System.out.println(a);
            }
            a = a-1;
        }

    }
}
