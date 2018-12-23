package br.com.ciceroednilson.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.ciceroednilson.repository.FuncionarioRepository;

@SpringBootApplication
@ComponentScan({"br.com.ciceroednilson.*"})
@EntityScan("br.com.ciceroednilson.entity")
@EnableJpaRepositories("br.com.ciceroednilson.repository")
public class MsSpringDataRestFuncionariosApplication {

	@SuppressWarnings("unused")
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MsSpringDataRestFuncionariosApplication.class, args);
	}
	
	
	
	

}

