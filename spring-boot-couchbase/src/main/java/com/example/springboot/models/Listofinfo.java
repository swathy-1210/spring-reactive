package com.example.springboot.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor
//@Data

@Builder
@Getter
@Setter
public class Listofinfo {

	
	    private String listid;
    	private  String listname;
	    private String listpurpose;
	
}
