package com.simplilearn.JunitApp.JunitApp;

public class App 
{
    public int add(int a, int b) {
    	return a + b ;
    }
    
    public int sub(int a, int b) {
    	return a - b ;
    }
    
    public int mul(int a, int b) {
    	if(a>0 && b>0) return a*b;
    	return 0;
    }
}
