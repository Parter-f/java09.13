package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a pontszámát");
        double  pont = sc.nextDouble();
        if (pont > 0 && pont < 43){
            System.out.println("elégstelen");
        }else if (pont > 42 && pont < 58){
            System.out.println("elégséges");
        }else if (pont > 58 && pont < 73){
            System.out.println("közepes");
        }else if (pont > 72 && pont < 88){
            System.out.println("jó");
        }else if (pont >= 88 ){
            System.out.println("elégséges");
        }

    }


}
