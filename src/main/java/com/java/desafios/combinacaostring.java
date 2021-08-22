package com.java.desafios;

import java.util.Scanner;

public class combinacaostring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= casos; i++) {
            StringBuilder analise = new StringBuilder();
            String[] words = scan.nextLine().split(" ");

            int maxSize = Math.max(
                    words[0].length(),
                    words[1].length());
            for (int dados = 0; dados < maxSize; dados++) {
                if (dados < words[0].length()) {
                    analise.append(words[0].charAt(dados));
                }

                if (dados < words[1].length()) {
                    analise.append(words[1].charAt(dados));
                }
            }
            System.out.println(analise.toString());

        }

    }
}
