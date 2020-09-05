package com.example.springboot.connector;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class MyDomainConnector {
	
	private WebClient client = WebClient.create("http://localhost:8080");

	  private Mono<ClientResponse> result = client.get()
	      .uri("/mydomainreactive")
	      .accept(MediaType.TEXT_PLAIN)
	      .exchange();

	  public String getResult() {
		  System.out.println("result--------"+result.toString());
	    return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
	  }

}
