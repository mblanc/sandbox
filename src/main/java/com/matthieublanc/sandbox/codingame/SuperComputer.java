package com.matthieublanc.sandbox.codingame;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SuperComputer {

	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(new File("test1.txt"));
		int n = in.nextInt();
		while (in.hasNextInt()) {
			System.out.println(in.nextInt());
		}
	}

}
