package com.pedro.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication {

	//simulando conflito de Merge.

	public static void main(String[] args) {
		boolean merge2 = false;
		SpringApplication.run(CursomcApplication.class, args);
	}

}
