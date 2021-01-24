package com.github.fabriciolfj.opa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class OpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpaApplication.class, args);
	}

}
