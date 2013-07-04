package com.matthieublanc.sandbox.codility;

public class OpenedShop {

	public static int[] A = new int[] { 0, 1, 2, 1 };
	public static int[] B = new int[] { 1, 2, 3, 3 };
	public static int[] C = new int[] { 2, 3, 4, 5 };

	public static int[] D = new int[] { -1, 1, -1, 8 };

	public static void main(String[] args) {
		System.out.println(solution(A, B, C, D));
	}

	public static int solution(int[] A, int[] B, int[] C, int[] D) {
		return minTime(A, B, C, D, 0, 0);
	}

	public static int minTime(int[] A, int[] B, int[] C, int[] D, int start, int time) {
		int min = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == start) {

			} else if (B[i] == start) {

			}
		}
		return -1;
	}

	public static int max(int[] array) {
		int result = -1;
		for (int value : array) {
			if (value > result) {
				result = value;
			}
		}
		return result;
	}

}
