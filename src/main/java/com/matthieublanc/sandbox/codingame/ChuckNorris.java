package com.matthieublanc.sandbox.codingame;

import java.util.Scanner;

class ChuckNorris {

	// 0 0 00 0000 0 00 0 0 00 0000 0 00
	// 0 0 00 0000 0 000 00 0000 0 00

	public static void main(String args[]) {
		System.out.println(Integer.toBinaryString((int) 'C'));
		try (Scanner scanner = new Scanner("C")) {
			scanner.useDelimiter("");
			boolean isZeros = true;
			boolean first = true;
			while (scanner.hasNext()) {
				String next = scanner.next();
	            if ("\n".equals(next)) {
	                break;
	            }
				char nextChar = next.toCharArray()[0];
				for (int j = 6; j >= 0; j--) {
					int bit = ((nextChar >> j) & 1);
					if (bit == 0) {
						if (first) {
							first = false;
							isZeros = true;
							System.out.print("00 0");
						} else if (!isZeros) {
							isZeros = true;
							System.out.print(" 00 0");
						} else {
							System.out.print("0");
						}
					} else {
						if (first) {
							first = false;
							isZeros = false;
							System.out.print("0 0");
						} else if (isZeros) {
							isZeros = false;
							System.out.print(" 0 0");
						} else {
							System.out.print("0");
						}
					}
				}
			}
		}
	}
}
