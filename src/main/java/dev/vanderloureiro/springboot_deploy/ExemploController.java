package dev.vanderloureiro.springboot_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @Value("${parametro-ex}")
    String parametroExemplo;

    @GetMapping("/exemplo")
    public String index() {
        return "Parametro de exemplo: " + parametroExemplo;
    }
}
