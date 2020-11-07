package com.company;
//1453 pbinfo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("arr[" + i + "]= ");
            int nr = scanner.nextInt();
            arr[i] = nr;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] % 2 == 0)
                c++;
            for (int j = i; j <= n; j++)
                arr[j] = arr[j + 1];
        }
        for (int i = 1; i <= n - c; i++)
            System.out.println(arr[i] + " ");
    }
}
