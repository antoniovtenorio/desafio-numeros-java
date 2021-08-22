package com.java.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class corridadatartaruga {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int escolhido1 = 0;
        int escolhido2 = 0;
        int escolhido3 = 0;
        //continue a solucao de acordo com o solicitado
        for (int j = 0; j < 3; j++) {
            int n;
            int contar = 1;
            int nivel1 = 0;
            int nivel2 = 0;
            int nivel3 = 0;

            int resultado = 0;
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");
            int size = s.length;
            int[] arrayInt = new int[size];
            for (int i = 0; i < size; i++) {
                arrayInt[i] = Integer.parseInt(s[i]);
            }

            while (n >= contar) {

                int leveis = arrayInt[contar - 1];
                if (leveis < 10) {
                    nivel1++;
                }
                if (leveis >= 10 && leveis < 20) {
                    nivel2++;
                }
                if (leveis >= 20) {
                    nivel3++;
                }

                contar++;
            }
            if (nivel1 > 0) {
                resultado = 1;
            }
            if (nivel2 > 0) {
                resultado = 2;
            }
            if(nivel3 > 0) {
                resultado = 3;
            }

            if(0 == j) {
                escolhido1 = resultado;
            }
            if(1 == j){
                escolhido2 = resultado;
            }
            if(2 == j) {
                escolhido3 = resultado;
            }
        }
        System.out.println(escolhido1);
        System.out.println(escolhido2);
        System.out.println(escolhido3);
    }
}

