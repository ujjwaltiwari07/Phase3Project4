package com.JunitProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthenticationTest {
private Authentication authenticate;
	
	@BeforeEach
	public void setup() {
		authenticate = new Authentication();
		System.out.println("Login Initiated");
	}
	
	@AfterEach
	public void tearDown() {
		authenticate = null;
		System.out.println("Login Closed");
	}
	@Test
	public void authenticateTest1() {
		assertEquals(true,authenticate.authentication("Ujjwal","Ujjwal@12345"));
		
	}
	
	@Test
	public void authenticateTest2() {
		assertEquals(false,authenticate.authentication("Ujjwal","something"));
	}
	
	@Test
	public void authenticateTest3() {
		assertEquals(false,authenticate.authentication("cjfgfjhy","Ujjwal@12345"));
	}
	
}

