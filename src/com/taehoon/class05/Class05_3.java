package com.taehoon.class05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class05_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      numbers.add(sc.nextInt());
    }
    String result = result(numbers.get(0), numbers.get(1));

    for (int i = 2; i < 8; i++) {
      if (!result.equals(result(numbers.get(i-1), numbers.get(i)))) {
        System.out.println("mixed");
        break;
      }
      if (i == 7) {
        System.out.println(result);
      }
    }

   }
   public static String result (int a, int b) {
    if (a > b) {
      return "descending";
    }
    return "ascending";
   }
}
