package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.models.Listofinfo;
import com.example.springboot.models.Mydomain;


@Repository
public interface MydomainRespository extends CrudRepository<Mydomain, String>{
	
	Mydomain findByName(String name);

	List<Listofinfo> getListOfInfoByName(String name);

}
