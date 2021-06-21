package com.aslan.sm703;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmokeTest {

	@Autowired
	private Sm703Controller controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}