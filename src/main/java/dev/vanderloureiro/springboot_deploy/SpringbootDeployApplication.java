package dev.vanderloureiro.springboot_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDeployApplication {

	@Value("${parametro-ex}")
	String parametroExemplo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDeployApplication.class, args);
	}

	@GetMapping
	public String index() {
		return "Parametro de exemplo: " + parametroExemplo;
	}

}
