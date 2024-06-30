package com.alrosa.staa.gatekeeper_server_lite;

import com.alrosa.staa.gatekeeper_server_lite.service.AdminsService;
import com.alrosa.staa.gatekeeper_server_lite.service.AdminsServiceImpl;
import com.alrosa.staa.gatekeeper_server_lite.service.UsersService;
import com.alrosa.staa.gatekeeper_server_lite.service.UsersServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class GatekeeperServerLiteApplication {
	@Bean
	public AdminsService adminsService() {
		return new AdminsServiceImpl();
	}
	@Bean
	public UsersService usersService() {
		return new UsersServiceImpl();
	}
	public static void main(String[] args) {
		SpringApplication.run(GatekeeperServerLiteApplication.class, args);
	}
}
