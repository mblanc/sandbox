package com.matthieublanc.sandbox;

import java.util.ArrayList;
import java.util.List;

public class OpenedShop {
	
	private int[] A;
	private int[] B;
	private int[] C;
	private int[] D;


	public int solution(int[] A, int[] B, int[] C, int[] D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		
		int max = maxValue(D);
		int squareIndex = 0;
		List<Integer> indexesOfSquareAlreadyVisited = new ArrayList<Integer>();
		int time = 0;
		int minTime = -1;
		if (D[0] != -1) {
			return 0;
		}
		return paths(squareIndex, time, indexesOfSquareAlreadyVisited, max, minTime);
	}

	private static int maxValue(int[] ints) {
		int max = ints[0];
		for (int ktr = 0; ktr < ints.length; ktr++) {
			if (ints[ktr] > max) {
				max = ints[ktr];
			}
		}
		return max;
	}

	public int paths(int squareIndex, int time, List<Integer> indexesOfSquareAlreadyVisited, int max, int minTime) {
		indexesOfSquareAlreadyVisited.add(squareIndex);
		for (int i = 0; i < A.length; i++) {
			int nextTime = C[i] + time;
			if (minTime == -1 || nextTime < minTime) {
				if (A[i] == squareIndex && !indexesOfSquareAlreadyVisited.contains(B[i])) {
					if (nextTime <= D[B[i]] && (minTime == -1 || nextTime < minTime)) {
						minTime = nextTime;
					} else if (nextTime <= max) {
						minTime = paths(B[i], nextTime, new ArrayList<Integer>(indexesOfSquareAlreadyVisited), max, minTime);
					}
				} else if (B[i] == squareIndex && !indexesOfSquareAlreadyVisited.contains(A[i])) {
					if (nextTime <= D[A[i]] && (minTime == -1 || nextTime < minTime)) {
						minTime = nextTime;
					} else if (nextTime <= max) {
						minTime = paths(A[i], nextTime, new ArrayList<Integer>(indexesOfSquareAlreadyVisited), max, minTime);
					}
				}
			}
		}
		return minTime;
	}
}
