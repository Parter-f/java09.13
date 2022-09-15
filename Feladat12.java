package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon megegy összeget maximum 1000ig");
        int a = sc.nextInt();
        int ketszazas = 0;
        int szazas = 0;
        int otvenes = 0;
        int huszas = 0;
        int tizes = 0;
        int otos = 0;
        while(a <= 0)
        {
            if (a-200 > 0)
            {
                a = a-200;
                ketszazas++;
            }
            else if (a-100 > 0)
            {
                a = a-100;
                szazas++;
            }else if (a-50 > 0)
            {
                a = a-50;
                otvenes++;
            }else if (a-20 > 0)
            {
                a = a-20;
                huszas++;
            }else if (a-10 > 0)
            {
                a = a-10;
                tizes++;
            }else if (a-5 > 0)
            {
                a = a-5;
                otos++;
            }

        }
        System.out.println("Az összeget a legkevesebb érmével így tudjuk kifizetni :");
    }
}
