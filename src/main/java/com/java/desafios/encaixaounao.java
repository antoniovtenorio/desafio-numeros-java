package com.java.desafios;

import java.util.Scanner;

public class encaixaounao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {
            String primeiraString = leitor.next();
            String segundaString = leitor.next();
            if (primeiraString.endsWith(segundaString))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
}

