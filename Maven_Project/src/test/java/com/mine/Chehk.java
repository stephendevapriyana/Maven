package com.mine;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Chehk implements IRetryAnalyzer{

	int count=1,limit=657523;
	public boolean retry(ITestResult result) {
		if (count<limit) {
			count++;
			return true;
			
		}
		return false;
	}
	
	

}
