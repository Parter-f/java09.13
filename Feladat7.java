package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg hanyadik hónapot írjuk");
        int a = sc.nextInt();
        if (a == 12 || a == 1 || a== 2){
            System.out.println("Tél van");
        }if (a == 3 || a == 4 || a== 5){
            System.out.println("Tavasz van");
        }if (a == 6 || a == 7 || a== 8){
            System.out.println("Nyár van");
        }if (a == 9 || a == 11 || a== 10){
            System.out.println("Tél van");
        }
    }
}
