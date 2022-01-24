package com.Kreftregisteret.KreftregisteretApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KreftregisteretAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KreftregisteretAppApplication.class, args);
	}

}
