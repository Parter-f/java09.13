package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg a háromszög 3 oldalának hosszát");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double  k = a+b+c;
            System.out.println("A Háromszög kerülete : " + k );
        }
        else{
            System.out.println("Hibás adatok");
        }


    }

}
