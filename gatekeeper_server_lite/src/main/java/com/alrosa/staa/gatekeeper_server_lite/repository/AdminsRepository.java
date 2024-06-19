package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsRepository extends JpaRepository<AdminsEntity, Long> { }
