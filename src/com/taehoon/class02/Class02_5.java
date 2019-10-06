package com.taehoon.class02;


import java.util.*;

public class Class02_5 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputLine = sc.nextLine();
    Integer[] inputArray = Arrays.asList(inputLine.split(" ")).stream().map(value -> Integer.parseInt(value)).toArray(Integer[]::new);
    List<Integer> inputList = Arrays.asList(inputArray);
    Collections.sort(inputList, Comparator.reverseOrder());
    System.out.println(inputList.get(1));
  }
}
