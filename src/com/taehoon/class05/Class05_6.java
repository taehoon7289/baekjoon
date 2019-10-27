package com.taehoon.class05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Class05_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNumber = sc.nextInt();
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < inputNumber; i++) {
      numbers.add(sc.nextInt());
    }
    Collections.sort(numbers, Collections.reverseOrder());
    int max = numbers.get(0);
    double sum = 0;
    for (Integer number : numbers) {
      sum += (double) number / max * 100;
    }
    System.out.println(sum/numbers.size());
  }
}
