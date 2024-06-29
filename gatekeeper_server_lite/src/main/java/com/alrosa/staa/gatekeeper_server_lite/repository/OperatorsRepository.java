package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.OperatorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorsRepository extends JpaRepository<OperatorsEntity, Long> {}
