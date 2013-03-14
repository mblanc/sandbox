package com.matthieublanc.sandbox;

class EquilibriumIndex {
	
	static int[] test = new int[] {-7, 1, 5, 2, -4, 3, 0 };
	
	public static void main(String[] args) {
		System.out.println(equi(test));
	}
	
	public static int equi(int[] A) {
		int length = A.length;
		long sumFromBeginning = 0;
		long sumFromEnd = 0;
		long[] sumFromBeginningArray = new long[length];
		long[] sumFromEndArray = new long[length];
		for (int i = 0; i < length; i++) {
			sumFromBeginning += A[i];
			sumFromEnd += A[length-(i+1)];
			sumFromBeginningArray[i] = sumFromBeginning;
			sumFromEndArray[length-(i+1)] = sumFromEnd;
		}
		for (int i = 0; i < length; i++) {
			if (sumFromBeginningArray[i] == sumFromEndArray[i]) {
				return i;
			}
		}
		return -1;
	}
}