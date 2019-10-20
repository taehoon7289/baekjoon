package com.taehoon.class05;

import java.util.*;

public class Class05_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());
    List<Integer> numbers = new ArrayList<>();
    for(int i =0 ; i < number; i++) {
      numbers.add(sc.nextInt());
    }
    Collections.sort(numbers);
    System.out.println(numbers.get(0) + " " + numbers.get(number-1));
  }
}
