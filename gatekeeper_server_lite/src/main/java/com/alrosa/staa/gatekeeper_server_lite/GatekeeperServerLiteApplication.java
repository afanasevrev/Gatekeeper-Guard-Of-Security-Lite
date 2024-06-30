package com.alrosa.staa.gatekeeper_server_lite;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.service.AdminsServiceImpl;
import com.alrosa.staa.gatekeeper_server_lite.service.BoxService;
import com.alrosa.staa.gatekeeper_server_lite.service.UsersServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatekeeperServerLiteApplication {
	@Bean
	public BoxService<AdminsEntity> adminsService() {
		return new AdminsServiceImpl();
	}
	public static void main(String[] args) {
		SpringApplication.run(GatekeeperServerLiteApplication.class, args);
	}
}
