package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.ControllersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ControllersRepository extends JpaRepository<ControllersEntity, Long> {}
