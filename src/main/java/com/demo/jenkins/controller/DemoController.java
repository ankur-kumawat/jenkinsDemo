package com.demo.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jenkins.models.DemoModel;


@RestController
@RequestMapping("/jenkins")
public class DemoController {
	
	@GetMapping("/demo")
	public DemoModel getDemo() {
		DemoModel demo = new DemoModel();
		return demo;
	}
}
