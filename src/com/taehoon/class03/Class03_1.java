package com.taehoon.class03;

import java.util.Scanner;

public class Class03_1 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    excute(number);
  }
  public static void excute(int number) {
    for (int i = 1; i <= 9; i++) {
      System.out.println(String.format("%d * %d = %d", number, i, number*i));
    }
  }
}
