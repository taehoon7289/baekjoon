package com.taehoon.class02;

import java.util.Scanner;

public class Class02_4 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputLine = sc.nextLine();
    String[] inputArray = inputLine.split(" ");
    int hour = Integer.parseInt(inputArray[0]);
    int minute = Integer.parseInt(inputArray[1]);
    System.out.println(excute(hour,minute));
  }
  public static String excute (int hour, int minute) {
    minute -= 45;
    if (minute < 0) {
      hour -= 1;
      minute += 60;
    }
    if (hour < 0) {
      hour += 24;
    }
    return String.format("%d %d",hour,minute);
  }
}
