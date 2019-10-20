package com.taehoon.class05;

import java.util.*;

public class Class05_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(sc.nextInt());
    }
    Map resultMap = new HashMap<>();
    for (Integer number : numbers) {
      number = number % 42;
      resultMap.put(number, number);
    }
    System.out.println(resultMap.size());
  }
}
