package com.taehoon.class05;

import java.util.*;

public class Class05_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNumber = Integer.parseInt(sc.nextLine());
    List<String> testCases = new ArrayList<>();
    List<Integer> results = new ArrayList<>();
    for (int i = 0; i < inputNumber; i++) {
      testCases.add(sc.nextLine());
    }
    for (String testCase : testCases) {
      Integer result = 0;
      int jumsu = 1;
      for (int i=0; i<testCase.length(); i++) {
        if (testCase.charAt(i) == 'O') {
          // O 인경우
          result += jumsu++;
        } else {
          // X 인경우
          jumsu = 1;
        }
      }
      results.add(result);
    }
    for (Integer result : results) {
      System.out.println(result);
    }
  }
}
