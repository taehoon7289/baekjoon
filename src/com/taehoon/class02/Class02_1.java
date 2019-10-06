package com.taehoon.class02;

import java.util.Scanner;

public class Class02_1 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(excute(a,b));
  }
  public static String excute (int a, int b) {
    if (a > b) {
      return ">";
    } else if(a < b) {
      return "<";
    } else {
      return "==";
    }
  }
}
