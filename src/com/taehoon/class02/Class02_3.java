package com.taehoon.class02;

import java.util.Scanner;

public class Class02_3 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(excute(a));
  }
  public static int excute (int a) {
    if (a % 4 == 0) {
      if (a % 100 == 0) {
        if (a % 400 == 0) {
          return 1;
        }
        return 0;
      }
      return 1;
    }
    return 0;
  }
}
