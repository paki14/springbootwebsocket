package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;
import com.example.demo.entity.Patient;
import com.example.demo.repository.CarePersonRepository;
@Service
public class CarePersonServiceImpl implements CarePersonService{
	@Autowired
	private CarePersonRepository carePersonRepository;
	@Override
	public List<CarePerson> getCarePersionById(Care care) {
		CarePerson carePerson;
		return carePersonRepository.findByCareId(care);
	}
	@Override
	public List<CarePerson> getAllCarePersion() {
		return carePersonRepository.findAll();
	}
	@Override
	public List<CarePerson> getCarePersionByPatientId(Patient patient) {
		return carePersonRepository.findByPatientId(patient);
	}

}
