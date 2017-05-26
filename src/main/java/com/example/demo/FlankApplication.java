package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan
@EnableScheduling
@SpringBootApplication
public class FlankApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlankApplication.class, args);
	}
//	@Bean
//	public EmbeddedServletContainerFactory servletContainer() {
//		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
//		factory.setPort(8081);
//		factory.setSessionTimeout(50, TimeUnit.MINUTES);
//		return factory;
//	}
}