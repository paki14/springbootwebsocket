package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;
import com.example.demo.entity.Patient;
import com.example.demo.service.CarePersonService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CarePersonController {
	@Autowired
	private CarePersonService carePersonService;

	@MessageMapping("/hello")
	@SendTo("/topic/hi")
	public List<CarePerson> getCarePersonById(Care care) {
		return carePersonService.getCarePersionById(care);
	}

	@MessageMapping("/hello2")
	@SendTo("/topic/hi2")

	public List<CarePerson> getAllCarePerson() {
		return (carePersonService.getAllCarePersion());
	}

	@MessageMapping("/hello3")
	@SendTo("/topic/hi3")
	public List<CarePerson> getCarePersonByPatientId(Patient patient) {
		return carePersonService.getCarePersionByPatientId(patient);

	}
	@Configuration
	public class Schedular {
		@Autowired
		SimpMessagingTemplate template;
//		
//		@Scheduled(fixedDelay=3000)
//		public void sehedulingUserTimeByPatient() {
//			template.convertAndSend("/topic/hi3", new Patient());
//		}
//		public void sehedulingUserTimeByCare() {
//		@Scheduled(fixedDelay=3000)
//			template.convertAndSend("/topic/hi2", new Care());
//		}
		@Scheduled(fixedRate=10000)
		public void sehedulingUserTime() {
//			template.convertAndSend("/topic/hi2", new CarePerson());
			template.convertAndSend("/topic/hi2", getAllCarePerson(), CarePerson());
			
		}
	}
	public Map<String, Object> CarePerson() {
		// TODO Auto-generated method stub
		return null;
	}
}
