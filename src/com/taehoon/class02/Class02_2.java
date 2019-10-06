package com.taehoon.class02;

import java.util.Scanner;

public class Class02_2 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(excute(a));
  }
  public static String excute (int a) {
    if (a >= 90) {
      return "A";
    } else if(a < 90 && a >= 80) {
      return "B";
    } else if(a < 80 && a >= 70) {
      return "C";
    } else if(a < 70 && a >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}
