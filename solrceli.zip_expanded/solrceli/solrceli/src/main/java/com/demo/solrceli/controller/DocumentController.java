package com.demo.solrceli.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RestController
@RequestMapping(value="/document")
public class DocumentController {

	@RequestMapping(value="/h1")
    public String getHi() {
		return "Hi";
	}
}
