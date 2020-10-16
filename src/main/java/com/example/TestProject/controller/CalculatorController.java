package com.example.TestProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestProject.service.CalculatorService;

@RestController
@CrossOrigin("*")
public class CalculatorController {
	
	@Autowired
	private CalculatorService service;
	
	@GetMapping("/add")
	public int addition(@RequestParam int a, @RequestParam int b)
	{
		//System.out.println("received params"+a +" "+b  );
		
		return service.addition(a, b);
		
		
	}
	@GetMapping("/subtract")
	public int subtraction(@RequestParam int a, @RequestParam int b)
	{
		//System.out.println("received params"+a +" "+b  );
		
		return service.subtraction(a, b);
		
		
	}
	@GetMapping("/multiply")
	public int multiplication(@RequestParam int a, @RequestParam int b)
	{
		//System.out.println("received params"+a +" "+b  );
		
		return service.multiplication(a, b);
		
		
	}

}
