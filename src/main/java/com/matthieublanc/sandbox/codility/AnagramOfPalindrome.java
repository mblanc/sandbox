package com.matthieublanc.sandbox.codility;

import java.util.HashMap;
import java.util.Map;

public class AnagramOfPalindrome {
	
	public static void main(String[] args) {
		System.out.println("---");
		System.out.println(isAnagramOfPalindrome("kayak"));
		System.out.println(isAnagramOfPalindrome("codilitytilidoc"));
		System.out.println(isAnagramOfPalindrome("coilidocdilityt"));
		System.out.println(isAnagramOfPalindrome("itytilicodildoc"));
		System.out.println(isAnagramOfPalindrome("coitytildilidoc"));
		System.out.println(isAnagramOfPalindrome("neveroddoreven"));
		System.out.println(isAnagramOfPalindrome("dooernedeevrvn"));
		System.out.println(isAnagramOfPalindrome("dooernaedeevrvn"));
		System.out.println("---");
		System.out.println(isAnagramOfPalindrome("dooernaedeebvrvn"));
		System.out.println(isAnagramOfPalindrome("mary"));
		System.out.println(isAnagramOfPalindrome("rocketboys"));
		System.out.println(isAnagramOfPalindrome("codility"));
	}

	public static int isAnagramOfPalindrome(String string) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (char c : string.toCharArray()) {
			Integer count = map.get(String.valueOf(c));
			if (count != null) {
				count = (count + 1) % 2;
			} else {
				count = 1;
			}
			map.put(String.valueOf(c),  count);
		}
		int sum = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			sum += entry.getValue();
		}
		int length = string.length();
		if ((length % 2) == 0 && sum == 0) {
			return 1;
		} else if (sum == 1){
			return 1;
		}
		return 0;
	}

}
