package com.infinno.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinno.exceptionhandler.exception.ApiClientRuntimeException;

@RestController
public class TestController {
	enum TestEnum{
		SOME_STRING
	}
	@GetMapping(value = "clientApi")
	public String getString() {
		throw new ApiClientRuntimeException(TestEnum.SOME_STRING);
	}
	@GetMapping(value = "generalApi")
	public String getString2() {
		throw new RuntimeException();
	}

}
