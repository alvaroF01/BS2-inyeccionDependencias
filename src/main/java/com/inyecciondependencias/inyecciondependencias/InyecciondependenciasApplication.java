package com.inyecciondependencias.inyecciondependencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication(scanBasePackages = {
		"com.inyecciondependencias.inyecciondependencias.bean"
})
public class InyecciondependenciasApplication {

	public static void main(String[] args) {

		SpringApplication.run(InyecciondependenciasApplication.class, args);



	}

}
