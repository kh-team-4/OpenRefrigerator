package com.boot.client.main.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		log.info("index() 실행");
		return "main";
	}

}