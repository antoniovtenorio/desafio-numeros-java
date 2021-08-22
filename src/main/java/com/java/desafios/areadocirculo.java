package com.java.desafios;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class areadocirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14159;
        //declare suas variaveis do tipo double

        double area = 0;
        double raio = 0;

        //continue a solucao
        raio = scan.nextDouble();

        area = PI * (raio * raio);
        System.out.printf("A=%.4f\n", area);
    }
}
