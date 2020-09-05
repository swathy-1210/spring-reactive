package com.example.springboot.routercontroller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.springboot.handler.MyDomainHandler;

public class MyDomainRouter {
	@Bean
	  public RouterFunction<ServerResponse> route(MyDomainHandler mydomainhandler) {

	    return RouterFunctions
	      .route(RequestPredicates.GET("/mydomainreactive").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), mydomainhandler::mydomainReactive);
	  }

}
