package com.idDataWeb.assessment;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "GirishBhakta12";
		String str2 = "Giresh bhakta12";
		
		String passOrFails = strCompare(str1, str2);
		System.out.println(passOrFails);
	}
	
	 private static String strCompare(String str1, String str2) {
		// TODO Auto-generated method stub
		 str1 =  str1.replaceAll("\\s", "");
		 str2 = str2.replaceAll("\\s", "");
		 
		if(str1.length() != str2.length()) {
			return "No match";
		}
		else {
			int length = str1.length();
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			int matchCount = 0;
			int unmatchCount = 0;
			int matchPercentage = 0;
			int unmatchPercentage = 0;

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {
//					System.out.println(ch1[i] + " matches " + ch2[i]);
					matchCount++;
				} else {
					unmatchCount++;
				}
			}
			System.out.println("matchCount is: " + matchCount);
			System.out.println("unmatchCount is: " + unmatchCount);

			matchPercentage = (matchCount * 100) / length;
			System.out.println("percentage :" + matchPercentage + "%");

			unmatchPercentage = (unmatchCount * 100) / length;
			System.out.println("percentage :" + unmatchPercentage + "%");

			if (matchPercentage > 75) {
				return "pass";
			} else {
				return "fail";
			}
		}
	}
			
	}
