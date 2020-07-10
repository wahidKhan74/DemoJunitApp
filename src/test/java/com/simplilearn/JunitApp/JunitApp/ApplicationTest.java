package com.simplilearn.JunitApp.JunitApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Addition Test Cases")
class ApplicationTest {
	App app;
	
	@BeforeEach
	void init() {
		app = new App();
	}
	
	@DisplayName("Test For Posistive Numbers")
	@Test
	void testAddPositive() {
		assertEquals(30, app.add(10, 20));
	}
	
	@DisplayName("Test For Negative Numbers")
	@Test
	void testAddNegative() {
		assertEquals(-30, app.add(-10, -20));
	}
	
	@DisplayName("Test For Posistive && Negative Numbers")
	@Test
	void testAddPostiveNegative() {
		assertEquals(10, app.add(-10, 20));
	}

}
