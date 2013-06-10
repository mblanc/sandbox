package com.matthieublanc.sandbox;


public class DryWell {

	public int solution(int[] well, int[] disks) {
		int bottom = well.length;
		for (int i = 0; i < disks.length; i++) {
			int currentDisk =  disks[i];
			if (i > 0 && disks[i] <= disks[i-1]) {
				bottom = bottom-1;
			} else {
				for (int j = 0; j < bottom; j++) {
					if (currentDisk > well[j]) {
						bottom = j-1;
						break;
					} else if (j == bottom-1) {
						bottom = j;
					}
				}
			}
			if (bottom == 0) {
				return i+1;
			} else if (bottom < 0) {
				return i;
			}
		}
		return disks.length;
	}

}
