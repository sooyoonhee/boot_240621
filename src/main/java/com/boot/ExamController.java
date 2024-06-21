package com.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller//legacy와 같은 방식
@Slf4j
public class ExamController {
	@RequestMapping("/")
//	public void home() {
	public String home() {
		log.info("hello boot");
		
		return "hello";
	}

}
