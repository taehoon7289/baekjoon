package com.taehoon.class03;

import java.io.*;
import java.util.StringTokenizer;

public class Class03_4 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int number = Integer.parseInt(str);
    for(int i =0; i < number; i++) {
      String testCase = br.readLine();
      StringTokenizer stn = new StringTokenizer(testCase, " ");
      int a = Integer.parseInt(stn.nextToken());
      int b = Integer.parseInt(stn.nextToken());
      bw.write(excute(a,b));
      bw.write("\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
  public static String excute(int a, int b) {
    return add(a,b).toString();
  }
  public static Integer add(int a, int b) {
    return a+b;
  }
}
