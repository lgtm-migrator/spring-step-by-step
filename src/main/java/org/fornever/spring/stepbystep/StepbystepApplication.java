package org.fornever.spring.stepbystep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
// enable swagger spring data rest support
@EnableSwagger2
@Import({ springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class })
public class StepbystepApplication {

	// Spring Framework will control the entire program from here
	public static void main(String[] args) {
		SpringApplication.run(StepbystepApplication.class, args);
	}

}
