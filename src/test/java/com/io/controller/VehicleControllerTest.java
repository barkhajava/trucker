package com.io.controller;




import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.io.entity.Vehicle;
import com.io.repository.VehicleRepository;



@RunWith(SpringRunner.class)
	@SpringBootTest(
			webEnvironment = SpringBootTest.WebEnvironment.MOCK
	)
@AutoConfigureMockMvc
public class VehicleControllerTest {
	 @Autowired
	    private MockMvc mvc;

	    @Autowired
	    private VehicleRepository repository;
	    
	    @Before
	    public void setup() {
	    	
	    }
	    
	    @After
	    public void cleanup() {
	        repository.deleteAll();
	    }
	    
	    @Test
	    public void findAll() throws Exception {
	    	Vehicle veh = new Vehicle();
	    	veh.setVin(2);
	    	repository.save(veh);
	    	
	        mvc.perform(MockMvcRequestBuilders.get("/vehicle/all"))
	           						.andExpect(status().isOk())
	           						.andDo(print())
	           						.andExpect(content().contentType("application/json"))
	           						.andExpect(jsonPath("$[0].vin") .value(1));
	        repository.flush();
	    }


}
