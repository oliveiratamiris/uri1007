package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;


        a = sc.nextInt();

        b = sc.nextInt();

        c = sc.nextInt();

        d = sc.nextInt();


        diferenca =  (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}