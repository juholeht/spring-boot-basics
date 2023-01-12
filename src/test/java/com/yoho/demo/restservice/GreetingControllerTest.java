package com.yoho.demo.restservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GreetingControllerTest {

	private final static String LOCALHOST_URL = "http://localhost";
	private final static String ENDPOINT_PATH = "/greeting";

	@Value(value = "${local.server.port}")
	private int port;

	@Autowired
	private GreetingController controller;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void runBeforeAllTestMethods() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject(LOCALHOST_URL + ":" + port + ENDPOINT_PATH, String.class))
				.contains("Hello, World");
	}

	@Test
	public void greetingShouldReturnSameMessageAsPosted() throws Exception {
		String greetingJSON = "{\"id\":2,\"content\":\"Hello, anna!\"}";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(greetingJSON, headers);

		assertThat(this.restTemplate.postForObject(LOCALHOST_URL + ":" + port + ENDPOINT_PATH, entity, String.class))
				.contains("Hello, anna");
	}
}
