package com.practice.timespacecomplex;
/**
 * Fibonacci series of different time complaxity
 * @author rdansena
 *
 */
public class Fibonacci {
	/**
	 * 
	 * @param Fibonacii series - calculating with O(2^n)
	 * @return
	 */
	private static int fib(int n) {
		if (n<=1) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10;
		for (int i = 0; i < n; i++) {
			System.out.print(fib(i)+",");
		}
	}
}
