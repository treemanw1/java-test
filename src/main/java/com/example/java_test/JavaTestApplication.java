package com.example.java_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.java_test.*")
@ComponentScan(basePackages = { "com.example.java_test.*" })
@EntityScan("com.example.java_test.*")   
public class JavaTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JavaTestApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JavaTestApplication.class);
    }
}
