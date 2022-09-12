package com.mine;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Analyzerr implements IAnnotationTransformer {


	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod, occurringClazz);
		
		annotation.setRetryAnalyzer(Chehk.class);
	}
	

}
