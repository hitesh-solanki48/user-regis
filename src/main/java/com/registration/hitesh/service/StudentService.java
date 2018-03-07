package com.registration.beauclair.service;

import com.registration.beauclair.model.Student;

public interface StudentService {
	  Student save(Student student);
	  boolean findByLogin(String userName, String password);
	  boolean findByUserName(String userName);
	}
