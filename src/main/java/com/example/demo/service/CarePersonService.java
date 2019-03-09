package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;
import com.example.demo.entity.Patient;

public interface CarePersonService {
	
	List<CarePerson> getCarePersionById(Care care);
	List<CarePerson> getAllCarePersion();
	List<CarePerson> getCarePersionByPatientId(Patient patient);
}
