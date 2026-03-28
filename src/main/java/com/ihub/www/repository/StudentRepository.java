package com.ihub.www.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihub.www.model.Student1;

@Repository
public interface StudentRepository extends CrudRepository<Student1,Integer> {

}
