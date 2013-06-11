package com.matthieublanc.sandbox;


public class DryWell {
	
	private int count = 0;
	
	public int solution(int[] well, int[] disks) {
		for (int i = 1; i < well.length; i++) {
			if (well[i] > well[i-1]) {
				well[i] = well[i-1];
			}
		}
		
		int j = 0;
		for (int i = well.length -1; i >= 0; i--) {
			System.out.println(count++);
			if (j >= disks.length) {
				break;
			}
			if (well[i] >= disks[j]) {
				j++;
			}
		}
		return j;
	}

}
