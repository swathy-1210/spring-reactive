package com.example.springboot.repository;

import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.models.Mydomain;


@Repository
public interface MyDomainReactiveRepository extends ReactiveCouchbaseRepository<Mydomain, String>{
	
	

}
