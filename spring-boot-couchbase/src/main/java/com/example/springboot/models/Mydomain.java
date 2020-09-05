package com.example.springboot.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Builder
@Data
@AllArgsConstructor
@Document
@Getter
@Setter
public class Mydomain {
		



		@Id
		@GeneratedValue(strategy= GenerationStrategy.UNIQUE)
	    String id;
	    
	    @NonNull
	    @Field
	    String name;
	    
	    
	    @Field
	    String details;
	    
		
	    @Field 
	    List<Listofinfo> listofinfo;
		 
	    
	    @Field
	    String comments;
	
}
