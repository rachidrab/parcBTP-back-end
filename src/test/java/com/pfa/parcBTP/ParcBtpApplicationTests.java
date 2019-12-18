package com.pfa.parcBTP;

import com.pfa.parcBTP.model.Transporter;
import com.pfa.parcBTP.repository.ChefChantierRepository;
import com.pfa.parcBTP.repository.TransporterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@SpringBootTest
class ParcBtpApplicationTests {

	@Autowired
	TransporterRepository transporterRepository;

	@Autowired
	ChefChantierRepository chefChantierRepository;

	@Test
	@GetMapping("/transporter")
	public Optional<Transporter> transporterAPI() {

		return transporterRepository.findByUsername("rachidrabou");

		//return "Hello Youtube";
	}

	@Test
	void contextLoads() {
	}

}
