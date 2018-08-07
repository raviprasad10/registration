package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.Registration;

public interface RegistrationDao extends JpaRepository<Registration, String>{

}
