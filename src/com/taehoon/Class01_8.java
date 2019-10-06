package com.taehoon;

import java.io.IOException;
import java.util.Scanner;

public class Class01_8 {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] strArray = inputLine.split(" ");
        int result = Integer.parseInt(strArray[0]);
        for(int i=1; i < strArray.length; i++) {
            result *= Integer.parseInt(strArray[i]);
        }
        System.out.println(result);

    }
}

