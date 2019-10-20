package com.taehoon.class05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class05_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      numbers.add(sc.nextInt());
    }
    Integer result = 1;
    for (Integer number : numbers) {
      result *= number;
    }
    countCharNumber(result);
  }
  public static void countCharNumber (Integer result) {
    int[] countCharNumberArray = new int[10];
    while(result > 0) {
      int temp = result % 10;
      result /= 10;
      countCharNumberArray[temp]++;
    }
    for(Integer i : countCharNumberArray) {
      System.out.println(i);
    }
  }
}
