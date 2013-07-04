package com.matthieublanc.sandbox.codility;

public class CannonBalls {
	
	public int[] solution(int[] ground, int[] cannonHeights) {
		for (int canonHeight : cannonHeights) {
			if (canonHeight > ground[0]) {
				for (int j = 1; j < ground.length; j++) {
					if (canonHeight <= ground[j]) {
						ground[j-1]++;
						break;
					}
				}
			}
		}
		return ground;
	}

}
