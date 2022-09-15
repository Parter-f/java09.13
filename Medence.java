package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Medence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a medence átmérőjét méterben :");
        double atmero = sc.nextDouble();
        System.out.print("Kérem adja meg a medence magasságát méterben:");
        double magassag = sc.nextDouble();
        double sugar = atmero/2 ;
        double  alapterulet = sugar  *sugar * Math.PI;
        double  terfogat = alapterulet * magassag;
        System.out.printf("A medence területe %f köbméter" , terfogat);

        

    }
}
