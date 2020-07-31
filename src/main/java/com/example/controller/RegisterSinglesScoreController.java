package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.RegisterSinglesScoreForm;
import com.example.service.RegisterSinglesScoreService;

@RestController
@RequestMapping("/")
public class RegisterSinglesScoreController {

	@Autowired
	private RegisterSinglesScoreService registerSinglesScoreService;
	
	@PostMapping("/registerSinglesScore")
	public Integer registerSinglesScore(@RequestBody RegisterSinglesScoreForm form) {
		return registerSinglesScoreService.registerSinglesScore(form);
	}
	
}
