package ideten.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ideten.library","ideten.application",})
public class IdetenApplication {


	public static void main(String[] args) {

		SpringApplication.run(IdetenApplication.class, args);
	}

}
