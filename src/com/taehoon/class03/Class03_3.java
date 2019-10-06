package com.taehoon.class03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class03_3 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());
    excute(number);
  }
  public static void excute(int number) {
    int sum = 0;
    for (int i=1; i<= number; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
