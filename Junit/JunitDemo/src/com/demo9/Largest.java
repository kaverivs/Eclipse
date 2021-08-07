package com.demo9;

public class Largest {
	public static long largestNum(int a, int b) {
		if(a>b) {
			return a;
		}
		else if (b>a) {
			return b;
		}
		else {
			return 0;
		}
		
	}

}
