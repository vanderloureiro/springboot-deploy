package dev.vanderloureiro.springboot_deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class SpringbootDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDeployApplication.class, args);
	}

	@GetMapping
	public String index() {
		return "index";
	}

}
