package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Care;
import com.example.demo.entity.CarePerson;
import com.example.demo.entity.Patient;
@Repository
public interface CarePersonRepository extends JpaRepository<CarePerson, Integer>{
	List<CarePerson> findByCareId(Care care);
	List<CarePerson> findByPatientId(Patient patient);

}
