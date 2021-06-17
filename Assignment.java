package com.idDataWeb.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Assignment {
	
	private String originalText;
	private int lineIndex;
	private int lenOfText;
	private String processedValues;
	
	Assignment(){
		
	}
	
	Assignment(String str){
		this.originalText = str;
	}

	Assignment(String str, int index, int len, String pvalue){
		this.originalText = str;
		this.lineIndex = index;
		this.lenOfText = len;
		this.processedValues = pvalue;
	}
	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public int getLineIndex() {
		return lineIndex;
	}

	public void setLineIndex(int lineIndex) {
		this.lineIndex = lineIndex;
	}

	public int getLenOfText() {
		return lenOfText;
	}

	public void setLenOfText(int lenOfText) {
		this.lenOfText = lenOfText;
	}
	
	
	@Override
	public String toString() {
		return "Assignment [originalText=" + originalText + ", lineIndex=" + lineIndex + ", lenOfText=" + lenOfText
				+ ", processedValues=" + processedValues + "]";
	}

}
