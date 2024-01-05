package com.Runner_Class;

public class Testtt {
	public static void main(String[] args) {
		int i, j;

		for (i = 7; i <= 10; i++) {
			
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}

			if (i == j) {
				System.out.println(i);
			}

		}
	}
}