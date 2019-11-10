package com.taehoon.class08;

import java.util.Scanner;

class Result {
  int type = 1;
  int x = 1;
  int y = 1;

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return this.x + "/" + this.y;
  }
}

public class Class08_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    sc.nextLine();
    int count = 1;
    int type = 1; // 1이면 분자--, 2이면 분모--
    Result result = new Result();
    while (count != X) {
      // X번 반복
      execute(result);
      count++;
    }
    System.out.println(result.toString());
  }
  private static void execute(Result result) {
    if (result.getType() == 1) {
      if (result.getX() == 1) {
        result.setY(result.getY()+1);
        result.setType(2);
      } else {
        result.setX(result.getX()-1);
        result.setY(result.getY()+1);
      }
    } else {
      if (result.getY() == 1) {
        result.setX(result.getX()+1);
        result.setType(1);
      } else {
        result.setX(result.getX()+1);
        result.setY(result.getY()-1);
      }
    }
  }
}
