package com.taehoon.class05;

import java.util.*;
import java.util.stream.Collectors;

public class Class05_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNumber = Integer.parseInt(sc.nextLine());
    List<String> testCases = new ArrayList<>();
    for (int i = 0; i < inputNumber; i++) {
      testCases.add(sc.nextLine());
    }
    sc.close();
    for (String testCase : testCases) {
      StringTokenizer stn = new StringTokenizer(testCase, " ");
      int size = Integer.parseInt(stn.nextToken());
      double sum = 0;
      List<Integer> list = new ArrayList<>();
      while(stn.hasMoreTokens()) {
        int value = Integer.parseInt(stn.nextToken());
        list.add(value);
        sum += value;
      }
      final double average = sum / size;
//      list = list.stream().filter(item -> {
//        return item > average;
//      }).collect(Collectors.toList());
      List<Integer> testList = new ArrayList<>();
      for (Integer i : list) {
        if (i > average) {
          testList.add(i);
        }
      }
      Double result =  (double) testList.size() / size;
      if (result > 0) {
        Long resultLong = Math.round(result * 100000);
        StringBuffer resultStr = new StringBuffer(resultLong.toString());
        System.out.println(resultStr.substring(0, 2) + "." + resultStr.substring(2, 5) + "%");
      } else {
        System.out.println("00.000%");
      }

    }
  }
}
