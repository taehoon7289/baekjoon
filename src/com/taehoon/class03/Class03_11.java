package com.taehoon.class03;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Class03_11 {
  public static void main (String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String info = sc.nextLine();
    StringTokenizer stn = new StringTokenizer(info, " ");
    int length = Integer.parseInt(stn.nextToken()); // 길이
    int value = Integer.parseInt(stn.nextToken()); // 기준값
    String str = sc.nextLine();
    StringTokenizer stn2 = new StringTokenizer(str, " ");
    StringBuilder sb = new StringBuilder();
    while (stn2.hasMoreTokens()) {
      int target = Integer.parseInt(stn2.nextToken());
      if (value > target) {
        sb.append(target+" ");
      }
    }
    System.out.println(sb.toString());
  }
}
