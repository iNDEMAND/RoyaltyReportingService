package com.indemand.reports;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.indemand.helper.RoyaltyReportingHelper;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ComponentScan
class RoyaltyReportingServiceApplicationTests {

	@Mock
	private RoyaltyReportingHelper helper;

	@Mock
	private Logger LOGGER;

	private MockMvc mockMvc;

	@BeforeAll
	public void setUp() {
		System.out.println("in setup");
		MockitoAnnotations.openMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(helper).build();

		// TBD

	}

	@Test 
	public void getHeartBeat_success() throws Exception{
		System.out.println("Testing HeartBeat");
		mockMvc.perform(MockMvcRequestBuilders
				.get("/royalty/hearbeat"))
		.andExpect(status().isOk());
	}


}
