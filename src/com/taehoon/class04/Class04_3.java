package com.taehoon.class04;

import java.io.*;

public class Class04_3 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Integer number = Integer.parseInt(br.readLine()); // 초기 값
    Integer tempNumber = number; // 변할 값
    int count = 0; // 반복횟수
    do {
      Integer a = tempNumber % 10; // 일의자리수
      Integer b = (tempNumber/10) + a; // 자리수의 합
      tempNumber = (a*10) + (b%10);
      count++;
    } while (number != tempNumber);
    bw.write(count + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
