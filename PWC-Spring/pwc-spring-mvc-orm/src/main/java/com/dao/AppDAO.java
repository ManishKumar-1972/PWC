package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Registration;

@Repository
public interface AppDAO extends CrudRepository<Registration, Integer> {

}
