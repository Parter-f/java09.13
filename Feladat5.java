package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg 2 oldalt egy téglalaphoz");
        double a = Double.parseDouble(sc.nextLine().replace(',' , '.'));
        sc.nextLine();
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kérem adja meg A kerületét(K) vagy a területét(T) szertné kiszámolni");
        String valaszto = sc.next();

        if (valaszto.equals("K"))
        {
            double ker = 2 * a + 2 * b ;
            System.out.println("A téglalap kerülete :" + ker );
        }
        else if (valaszto.equals("T"))
        {
            double ter = a * b;
            System.out.println("A téglalap területe :" + ter);
        }
        else{
            System.out.println("A feladat hibás");
        }
    }

}
