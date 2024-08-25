package me.dio.santander_dev_week_java;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(servers = {@Server (url = "/", description = "Default server URL")})
@SpringBootApplication
public class SantanderDevWeekJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeekJavaApplication.class, args);
	}

}
