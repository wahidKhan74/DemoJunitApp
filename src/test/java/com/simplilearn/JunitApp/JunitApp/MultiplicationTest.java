package com.simplilearn.JunitApp.JunitApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MultiplicationTest {
	App app ;
	
	@BeforeEach
	void setUp() throws Exception {
		app = new App();
	}

	@Test
	void test() {
		assertEquals(200, app.mul(10, 20));
	}
	
	@Test
	void test2() {
		assertEquals(0, app.mul(100, -20));
	}
	
	@Test
	@Disabled
	void test3() {
		assertEquals(0, app.mul(-100, 20));
	}

}
