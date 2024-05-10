package com.java.MoodAnalyzer;

public class MoodAnalysisException extends Exception{

	MoodAnalysisException(String message)
	{
		super(message);
	}
	
	public String getMessage()
	{
		return "Happy";
	}
}
