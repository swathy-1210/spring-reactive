package com.example.springboot.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.Mydomain;
import com.example.springboot.repository.MyDomainReactiveRepository;
import com.example.springboot.repository.MydomainRespository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/mydomain")
@ComponentScan

public class HelloController {
	
	@Autowired
    MydomainRespository mydomainRepository;
	@Autowired
    MyDomainReactiveRepository mydomainReactiveRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
   @GetMapping("/{id}")
    public Optional<Object> getBlog(@PathVariable String id) {
	   System.out.println("Inside get");
        if (mydomainRepository.existsById(id)) {
        	System.out.println("JSON :::"+mydomainRepository.findById(id));
			return mydomainRepository.findById(id).map(jsonArray -> jsonArray.toString());
        } else 
        	System.out.println("JSON ::: is empty");
            return null;
	    }	
  
	
	@PostMapping("/")
    public Mydomain addBlogPost(@RequestBody Mydomain myDomainDocument) {
		
        return mydomainRepository.save(myDomainDocument);
    }
	
 @GetMapping("/reactive/{id}")
	public Mono<Mydomain> reactiveGet(@PathVariable String id) {
	 	 System.out.println("inside reactiveGet");
	 	 LOGGER.debug("This is a info log message");
	     return mydomainReactiveRepository.findById(id);
	}
	

}
