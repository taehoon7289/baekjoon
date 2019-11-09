package com.taehoon.class07;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Class07_9 {
  public static void main(String[] args) {
    List<String> croList = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    int count = 0;
    for (String cro : croList) {
      while (word.indexOf(cro) > -1) {
        word = word.replaceFirst(cro, " ");
        count++;
      }
    }
    count += word.replace(" ", "").length();
    System.out.println(count);
  }
}
