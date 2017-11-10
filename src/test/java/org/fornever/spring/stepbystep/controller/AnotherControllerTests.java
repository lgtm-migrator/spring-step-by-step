package org.fornever.spring.stepbystep.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AnotherControllerTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void astringTest() throws Exception {
		mockMvc.perform(get("/api/v1/anotherpath")).andExpect(content().string(containsString("return a string")));
	}

	@Test
	public void iwantjsonTest() throws Exception {
		mockMvc.perform(get("/api/v1/iwantjson")).andExpect(jsonPath("hello", is("json")));
	}

	@Test
	public void addTest() throws Exception {
		mockMvc.perform(get("/api/v1/add").param("a", "1").param("b", "211"))
				.andExpect(content().string(containsString("212")));
	}

}
