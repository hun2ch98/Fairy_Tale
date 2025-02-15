package dev.mvc.fairy_tale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "dev.mvc")
public class FairyTaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FairyTaleApplication.class, args);
	}

}
