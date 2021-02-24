package com.zdc.gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleController {

	@GetMapping
	public String getStr(){
		return "hello gradle";
	}
}
