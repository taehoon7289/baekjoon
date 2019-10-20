package com.taehoon.class05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class05_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    for(int i =0 ; i < 9; i++) {
      numbers.add(sc.nextInt());
    }
    int max = numbers.get(0);
    int maxIndex = 1;
    boolean isEnd = false;
    int count = 0;
    while (!isEnd) {
      for (Integer number : numbers) {
        count++;
        if (max < number) {
          max = number;
          maxIndex = count;
          break;
        }
      }
      if (count == 9) {
        isEnd = true;
      }
      count = 0;
    }
    System.out.println(max);
    System.out.println(maxIndex);
  }
}
