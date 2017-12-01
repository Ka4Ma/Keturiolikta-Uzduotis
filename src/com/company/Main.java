package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] pirmas = {5, 90, 46, 3, 501, 9763};
        int[] antras =new int[pirmas.length];
        for (int i = 0; i < pirmas.length; i++) {

            antras[i] = pirmas[pirmas.length - i - 1];
        }
        for (int i = 0; i< antras.length; i++) {
            System.out.println(antras[i]);
        }
        return;

    }
}
