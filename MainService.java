package com.idDataWeb.assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainService {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list of string objects
		
		
//		Assignment a1 = new Assignment("Text");
//		Assignment a2 = new Assignment("Bestie");
//		Assignment a3 = new Assignment("Resting");
//		
//		List<Assignment> AssignmentList = new ArrayList<>();
//		AssignmentList.add(a1);
//		AssignmentList.add(a2);
//		AssignmentList.add(a3);
//		
//		a1.setLenOfText(a1.getOriginalText().length());
//		a2.setLenOfText(a2.getOriginalText().length());
//		a3.setLenOfText(a3.getOriginalText().length());
//		
//		a1.setLineIndex(a1.getOriginalText().indexOf(a1.getOriginalText()));
//		a2.setLineIndex(a1.getOriginalText().indexOf(a2.getOriginalText()));
//		a3.setLineIndex(a1.getOriginalText().indexOf(a3.getOriginalText()));
//		
//		List<String> str = new ArrayList<>();
//		
//		for(int i=0;i<AssignmentList.size();i++) {
//			System.out.println(AssignmentList.get(i));
//			str.add(AssignmentList.get(i).getOriginalText());
//		}
////		System.out.println(AssignmentList);
//		
//		System.out.println(str);

		
		
		List<String> linesOfText = List.of("Text", "Bestie", "Resting","AresAAAA","Wwg","QrQ","TTraTT","P","JDraaD","RcgRR","YaHoo","OOawgO","IOIhjgIO");
//		linesOfText.forEach((String s) -> System.out.println(s));
		
	
//		for(int i = 0; i< linesOfText.size(); i++) {
//			System.out.println(linesOfText.get(i));
//			System.out.println(linesOfText.get(i).length());
//			System.out.println(linesOfText.indexOf(linesOfText.get(i)));
//		}
		
		
		List<Assignment> newList = process(linesOfText);
		newList.forEach((Assignment a) -> System.out.println(a));
		
		int count = 0;
		int length =0;
		HashMap<Integer, Integer> lenRep = new HashMap<Integer, Integer>();
		for(int i = 0; i< newList.size() ; i++) {
			length = newList.get(i).getLenOfText();
			if(length == 0) {
				continue;
			}
			count=1;
			for(int j = i+1; j<newList.size(); j++ ) {
//				length = newList.get(i).getLenOfText();
				
				if(length == newList.get(j).getLenOfText()) {
					count++;
					newList.get(j).setLenOfText(0);;
				}
			}
//			HashMap<Integer, Integer> lenRep = new HashMap<Integer, Integer>();
			lenRep.put(length, count);
		}
		
		for(Map.Entry<Integer, Integer> info: lenRep.entrySet()) {
			System.out.println("Length " +info.getKey()+ " occurs " + info.getValue() +" times");
		}
		
	
		
		Set<Integer> keySet = lenRep.keySet();
		ArrayList<Integer> lengthOfString = new ArrayList<>(keySet);
		System.out.println("Length of strings:" +lengthOfString);
		
		Collection<Integer> values = lenRep.values(); 
		ArrayList<Integer> repeats = new ArrayList<>(values);
		System.out.println("Repetatio of strings:" +repeats);
		
		Collections.sort(repeats,Collections.reverseOrder());
		System.out.println("Repetatio of strings:" +repeats);
	}
	
	public static List<Assignment> process(List<String> input){
		
		List<String> processedValue = new ArrayList<>();
			
		List<Assignment> asgn = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			if(i == 0) {
				processedValue.add(i, input.get(i).toUpperCase());
			}else if ((i % 2 == 0) && (i % 10 != 0)) {
				processedValue.add(i, input.get(i).toUpperCase());
			}else if (i % 10 == 0) {
				processedValue.add(i, input.get(i));
			}  
			else {
				processedValue.add(i, input.get(i).toLowerCase());
			}

			asgn.add(new Assignment(input.get(i), input.indexOf(input.get(i)), input.get(i).length(),processedValue.get(i)));
		}
//		System.out.println(asgn);
		return asgn;
	}


}
