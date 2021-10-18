package com.crm.demoua.genericUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImpclass implements IRetryAnalyzer{

	int counter=0;
	int retrylimit=4;

	public boolean retry(ITestResult result) {
		if(counter<retrylimit) {
			System.out.println("fail");
			counter++;
			return true;
		}
		return false;

}}
