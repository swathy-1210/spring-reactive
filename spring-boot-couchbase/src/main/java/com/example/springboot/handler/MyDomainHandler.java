package com.example.springboot.handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.springboot.repository.MyDomainReactiveRepository;

import reactor.core.publisher.Mono;

@Component
public class MyDomainHandler {
	
	@Autowired
    MyDomainReactiveRepository mydomainReactiveRepository;
	
	  public Mono<ServerResponse> mydomainReactive(ServerRequest request) {
		  System.out.println("Inside MyDomainHandler");
	    return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
	      .body(BodyInserters.fromValue( mydomainReactiveRepository.findById("123")));
	  }

}
