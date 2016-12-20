package com.practice.timespacecomplex;

/**
 * Fibonacci series of different time complaxity
 * 
 * @author rdansena
 * 
 */
public class Fibonacci {
	/**
	 * 
	 * @param Fibonacii
	 *            series - calculating with O(2^n)
	 * @return
	 */
	private static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	/**
	 * Fibonacci with O(n)
	 * @param n
	 * @return
	 */
	static int fibAnother(int n) {
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 1];
		int i;

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;
		f[1] = 1;
		for (i = 2; i <= n; i++) {
			/*
			 * Add the previous 2 numbers in the series and store it
			 */
			f[i] = f[i - 1] + f[i - 2];
			System.out.print(f[i]+",");
		}

		return f[n];
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + ",");
		}
		System.out.println();
		System.out.println(fibAnother(n));
	}
}
