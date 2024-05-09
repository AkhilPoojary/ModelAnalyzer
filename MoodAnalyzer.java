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

	public  String analyseMood() throws Exception
	{
		if(!message.contains("sad")||!message.contains("happy"))
		{
			throw new Exception();
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
