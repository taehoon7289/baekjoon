package com.taehoon.class03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class03_7 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());
    List<String> testCases = new ArrayList<>();
    for (int i=0; i<number; i++) {
      testCases.add(sc.nextLine());
    }
    excute(testCases);
  }
  public static void excute(List<String> testCases) {
    for(int i=0; i<testCases.size(); i++) {
      String[] testCaseArray = testCases.get(i).split(" ");
      int a = Integer.parseInt(testCaseArray[0]);
      int b = Integer.parseInt(testCaseArray[1]);
      System.out.println(String.format("Case #%d: %d", i+1, add(a,b)));
    }
  }
  public static int add(int a, int b) {
    return a+b;
  }
}
