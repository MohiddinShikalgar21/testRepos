package com.hsbc.question2;
import java.util.Scanner;

public class SecondsToDaysConversion {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secondsToConvert= sc.nextInt();
        String result= convertTime(secondsToConvert);
        System.out.println(result)
	}
	
	static String convertTime(int seconds) {
		// logic : 1 day consists of 24*3600 sec, 1 hour of 3600 sec, 1 min of 60 sec.
		int days= seconds/(24*3600);
		seconds %= (24*3600);
		int hours= seconds/3600;
		seconds %= 3600;
		int minutes= seconds/60;
		seconds %= 60;
		String newTime= days+" Days, "+hours+" Hours, "+minutes+" Minutes, "+seconds+" Seconds.";
		return newTime;
	}
	
}