package org.practice;

public class Java_Practice {
	public static void main(String[] args) {
		String ma = "WelcomE";
		String m = ma.toLowerCase();
		int count =0;
		for (int i = 0; i < m.length(); i++) {
			if (m.charAt(i)=='a'||m.charAt(i)=='e'||m.charAt(i)=='i'||m.charAt(i)=='o'||m.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	
	} 
	
	
}
