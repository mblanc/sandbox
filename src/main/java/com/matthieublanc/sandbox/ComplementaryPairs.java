package com.matthieublanc.sandbox;

import java.util.Arrays;

public class ComplementaryPairs {
	
	private static int[] array = new int[] {1, 8, -3, 0, 1, 3, -2, 4, 5, 5};

	public static void main(String[] args) {
		System.out.println(complementary_pairs2(6, array));
		System.out.println(complementary_pairs(6, array));
	}

	public static int complementary_pairs(int K, int[] A) {
		Arrays.sort(A);
		int[] B = new int[A.length];
		int duplicate = 0;
		for (int i = 1; i < A.length ; i++) {
			if (A[i] > A[i-1]) {
				B[i] = A[i];
			} else {
				if (A[i] == K) {
					duplicate++;
				} else {
					duplicate += 2;
				}
			}
		}
		int count = 0;
		int i = 0;
		int j = A.length -1;
		while (i <= j) {
			long pairSum = (long) A[i] + (long) A[j];
			if (pairSum < K) {
				i++;
			} else if (pairSum > K) {
				j--;
			} else {
				if (i == j) {
					count++;
				} else {
					count += 2;
				}
				i++;
				j--;
			}
		}
			
		return count + duplicate;
	}
	
	public static int complementary_pairs2(int K, int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (A[i] + A[j] == K) {
					count++;
				}
			}
		}
			
		return count;
	}

}
