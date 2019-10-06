package com.taehoon.class01;

import java.io.IOException;
import java.util.Scanner;

public class Class01_7 {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] strArray = inputLine.split(" ");
        int sum = Integer.parseInt(strArray[0]);
        for(int i=1; i < strArray.length; i++) {
            sum -= Integer.parseInt(strArray[i]);
        }
        System.out.println(sum);

    }
}

