package org.micro.brinder.demo;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ServiceController.class)

public class ServiceControllerTest {
	@Autowired
	private MockMvc mvc;

	// @MockBean
	// private SomeService someService;

	@Test
	public void properResponse() throws Exception {
		this.mvc.perform(get("/isThisThingOn").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk())
				.andExpect(content().string("Hi Brinder, I'm awake. Here is your response."));

	}
}