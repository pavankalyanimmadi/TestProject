package com.example.TestProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.TestProject.service.CalculatorService;

@SpringBootTest
class TestProjectApplicationTests {
	
	@Autowired
	private CalculatorService service;
	
	
	@Test
	public void addTest()
	{
		assertEquals(30, service.addition(10, 20));
	}
	@Test
	public void subtractTest()
	{
		assertEquals(-10, service.subtraction(10, 20));
	}
	
	@Test
	public void multiplyTest()
	{
		assertEquals(200, service.multiplication(10, 20));
	}
	
	
	

	

}
