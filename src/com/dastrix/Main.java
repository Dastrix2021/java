package com.dastrix;

import com.dastrix.git.TestGit;

import java.util.Scanner;

import static com.dastrix.git.TestGit.One;


public class Main {

    public static void main(String[] args) {
        int [] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элемнетов в массиве: ");
        n = in.nextInt ();
        a = new int [n];
        int i = 0;
        do {
            System.out.print("Введите a[" + i + "] = ");
            a[i] = in.nextInt ();
            i++;
        } while (i < n);
        System.out.println("Готово");
        One();
    }
}
