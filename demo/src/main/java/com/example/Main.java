package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de numero a iterar(separados por ,)");
        String entrada = teclado.nextLine();
        String[] elementos = entrada.split(",");
        double[] elementos2 = new double[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            elementos2[i] = Double.parseDouble(elementos[i]);
        }
        int n = elementos2.length;
        Arrays.sort(elementos2);
        if (n % 2 == 0) {
            double mediana = (elementos2[n / 2] + elementos2[n / 2 - 1])/2;
            System.out.println("La mediana es -->" + mediana);
        } else {
            double mediana = elementos2[n / 2];
            System.out.println("La mediana es -->" + mediana);
        }
        teclado.close();
    
    }
}