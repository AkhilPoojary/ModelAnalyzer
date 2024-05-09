package com.java.MoodAnalyzer;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer()
	{

	}

	public MoodAnalyzer(String message)
	{
		this.message=message;
	}

	public  String analyseMood()
	{
		if(message.contains("sad"))
		{
			return "sad";
		}
		else	
			return "happy";

	}
	public static void main(String[] args) {

		MoodAnalyzer m=new MoodAnalyzer("i am in sad mood");

		m.analyseMood();
	}
}
