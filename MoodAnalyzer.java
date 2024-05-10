package com.java.MoodAnalyzer;

public class MoodAnalyzer {
	
	enum Mood{
		HAPPY, SAD, EMPTY, NULL
	}

	String message;

	public MoodAnalyzer()
	{

	}

	public MoodAnalyzer(String message)
	{
		this.message=message;
	}

	public  String analyseMood() throws Exception
	{
		Mood mood;
		if(!message.contains("sad")||!message.contains("happy"))
		{
		
		}
		
		if(message==null)
		{
			mood=Mood.NULL;
			throw new NullPointerException();
		}
			
		
		if(message.contains("sad"))
		{
			return "sad";
		}
		else	
			return "happy";

	}
	public static void main(String[] args) {

		MoodAnalyzer m=new MoodAnalyzer("i am in sad mood");

		try {
			m.analyseMood();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
