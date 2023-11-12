package com.infinno.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.infinno.exceptionhandler.exception.ApiClientRuntimeException;


@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class Tests {
	
	private class R {
		
		String code;
		String message;
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		 
	 
}
	private enum TestEnum{
		SOME_STRING
	}
	@Autowired
	private MockMvc mockMvc;

	@Test
	void when_apiThrowsClientExcpetionAndThereIsBulgarianTranslation_then_theBgTranslatedMessageIsReturned()
			throws Exception {
		
		String someStringLocalisedBg = "Някакъв низ";
		
		MvcResult result = mockMvc
				.perform(get("/clientApi").header(HttpHeaders.ACCEPT_LANGUAGE, "bg, en;q=0.5, *;q=0.1"))
				.andExpect(status().isBadRequest()).andReturn();
		String response = result.getResponse().getContentAsString(StandardCharsets.UTF_8);
		Gson gson = new Gson();

		R r = gson.fromJson(response, R.class);
		assertThat(r.getCode()).isEqualTo(TestEnum.SOME_STRING.name());
		assertThat(r.getMessage()).isEqualTo(someStringLocalisedBg);

	}
}