package com.simplilearn.JunitApp.JunitApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitLifeCyleHooksTest {
	
	@BeforeAll
	static void setUp() {
		System.out.println("Executed :- Befor All");
	}
	
	@BeforeEach
	void setUpThis() {
		System.out.println("Executed :- Befor EveryTest case");
	}
	
	@Test
	void test1() {
		System.out.println("--------------------");
		System.out.println("Test 1 is executed");
		System.out.println("--------------------");
	}
	
	@Test
	void test2() {
		System.out.println("--------------------");
		System.out.println("Test 2 is executed");
		System.out.println("--------------------");
	}
	
	@AfterEach
	void tearDownThis() {
		System.out.println("Executed :- After EveryTest case");
	}
	
	@AfterAll
	static void tearDown() {
		System.out.println("Executed :- After All / At the last");
	}
	

}
