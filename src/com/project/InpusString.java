package com.project;

public class InpusString {
	
	public static void main(String[] args) {
		
		String str = "Satyam 9";
		char[] ch = str.toCharArray();
		String subString1 = null;
		String subString2 = null;
		int intValue = 0;
		
		for (int i = 0 ; i< ch.length ; i++) {
			
			if(ch[i] == ' ') {
				subString1 = str.substring(0, i);  //(0,6) 0,1,2,3,4,5
				intValue = Integer.parseInt(str.substring(i+1, str.length())); // (7,8)
			}
			
		}
		
		System.out.println("subString1 :"+subString1);
		System.out.println("intValue :"+intValue);
		
	}

}
