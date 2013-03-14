package com.matthieublanc.sandbox;


public class DryWell {
	
	public static int [] well = new  int[] {5, 6, 4, 3, 6, 2, 3};
	public static int [] disks = new  int[] {2, 3, 5, 2, 4};
	
	public static int [] well2 = new  int[] {5, 6, 4, 3, 6, 2, 3};
	public static int [] disks2 = new  int[] {6, 3, 5, 2, 4};
	
	
	
	public static void main(String[] args) {
		System.out.println(falling_disks(well, disks));
		System.out.println(falling_disks(well2, disks2));
	}

	public static int falling_disks(int[] well, int[] disks) {
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
