package com.taehoon.class03;

import java.io.*;

public class Class03_5 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    int number = Integer.parseInt(str);
    for(Integer i=1; i <= number; i++) {
      bw.write(i.toString());
      bw.write("\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
