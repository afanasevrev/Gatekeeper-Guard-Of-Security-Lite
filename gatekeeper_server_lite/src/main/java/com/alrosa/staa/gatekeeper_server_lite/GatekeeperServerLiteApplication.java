package com.alrosa.staa.gatekeeper_server_lite;

import com.alrosa.staa.gatekeeper_server_lite.messaging.RabbitConfiguration;
import com.alrosa.staa.gatekeeper_server_lite.service.*;
import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
@SpringBootApplication
@Import(RabbitConfiguration.class)
@EnableAutoConfiguration
@ComponentScan
public class GatekeeperServerLiteApplication {
	@Bean
	public AdminsService adminsService() {
		return new AdminsServiceImpl();
	}
	@Bean
	public UsersService usersService() {
		return new UsersServiceImpl();
	}
	@Bean
	public InspectorsService inspectorsService() {
		return new InspectorsServiceImpl();
	}
	@Bean
	public OperatorsService operatorsService() {
		return new OperatorsServiceImpl();
	}
	@Bean
	public AccessLevelsService accessLevelsService() {
		return new AccessLevelsServiceImpl();
	}
	@Bean
	public ControllersService controllersService() {
		return new ControllersServiceImpl();
	}
	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(GatekeeperServerLiteApplication.class, args);
	}
}
