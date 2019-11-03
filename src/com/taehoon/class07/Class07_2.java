package com.taehoon.class07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
public class Class07_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = Integer.parseInt(sc.nextLine());
    int[] nums = new int[n];
    String numbers = sc.nextLine();
    for (int i=0; i<numbers.length(); i++) {
      nums[i] = Integer.parseInt(numbers.substring(i, i+1));
    }
    System.out.println(Arrays.stream(nums).sum());
  }
}
