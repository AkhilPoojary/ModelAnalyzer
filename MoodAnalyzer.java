package com.java.MoodAnalyzer;

public class MoodAnalyzer {

	public  String analyseMood(String mesg)
	{
		if(mesg.contains("sad"))
		{
			return "sad";
		}
		else	
			return "happy";

	}
	public static void main(String[] args) {

		MoodAnalyzer m=new MoodAnalyzer();

		m.analyseMood("i am in sad mood");
	}
}
