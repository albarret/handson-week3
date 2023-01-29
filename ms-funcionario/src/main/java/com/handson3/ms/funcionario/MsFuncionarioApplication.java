package com.handson3.ms.funcionario;

import com.eldorado.commons.configuration.EnableMapper;
import com.eldorado.commons.interception.EnableAuthorization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableAuthorization
@EnableMapper
public class MsFuncionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFuncionarioApplication.class, args);
	}

}
