package com.promineotech.jeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import lombok.Getter;

public class BaseTest {
	@LocalServerPort
	private int serverPort;
	
	@Autowired
	@Getter
	private TestRestTemplate restTemplate;
/**
 * 
 * @return
 */
protected String getBaseUriForOrders() {
	return String.format("http:localhost:%d/orders", serverPort);
}
/**
 * 
 * @return
 */
protected String getBaseUriForJeeps() {
	return String.format("http:localhost:%d/jeeps", serverPort);
}
}
