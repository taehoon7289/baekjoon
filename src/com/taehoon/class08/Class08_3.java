package com.taehoon.class08;

import java.util.Scanner;

public class Class08_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    System.out.println(execute(N));

  }
  private static int execute (int N) {
    int count = 0;
    int max = 2;
    int min = 1;
    while (!(max > N && min <= N)) {
      count++;
      min = max;
      max = (6 * count) + max;
    }
    return count + 1;
  }
}
