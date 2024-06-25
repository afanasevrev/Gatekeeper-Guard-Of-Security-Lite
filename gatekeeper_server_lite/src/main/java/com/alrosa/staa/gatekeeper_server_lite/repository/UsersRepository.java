package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {}
