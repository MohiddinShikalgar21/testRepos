package com.hsbc.question1;

public class FibonacciSum {
	
	public static void main(String[] args) {
		int limit=10;
		int result= findSumOfSequence(limit);
		System.out.println(result);
	}
	
	static int findSumOfSequence(int limit) {
		// Logic : Start with the first 2 known digits of sequence and update num1 and num2 with consequent digits for sum.
		int num1=0, num2=1;
		System.out.println(num1+" "+num2+" ");
		int sum= num1+num2;
		for(int i=2;i<limit;i++) {
			int nextNum= num1+num2;
			System.out.println(nextNum+" ");
			sum+= nextNum;
			num1=num2;
			num2=nextNum;
		}
		return sum;
	}
	
}