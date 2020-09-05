package com.example.springboot.config;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	@Override
	public String getConnectionString() {
		 return Collections.singletonList("127.0.0.1").toString();
	}

	@Override
	public String getUserName() {
		return "admin";
	}

	@Override
	public String getPassword() {
		return "admin123";
	}

	@Override
	public String getBucketName() {
		return "mydomain";
	}
}
