package com.company;
//1453 pbinfo

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("arr[" + i + "]= ");
            int nr = scanner.nextInt();
            lista.add(nr);
        }
        for (int i = 1; i <= n; i++) {
            if (lista.get(i) % 2 == 0)
                lista.remove(lista.get(i));
        }
        System.out.println(lista);
    }
}
