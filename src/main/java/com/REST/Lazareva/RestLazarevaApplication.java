package com.REST.Lazareva;

import com.google.gson.JsonObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestLazarevaApplication {

	public static void main(String[] args) {
		JsonObject value = new JsonObject();
		value.addProperty("login", "privet");
		value.addProperty("password", "poka");
		System.out.println(value);

		SpringApplication.run(RestLazarevaApplication.class, args);
	}

}
