package com.MVCexample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MVCexample.demo.model.Programmer;
@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer>  {

}
