package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.InspectorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectorsRepository extends JpaRepository<InspectorsEntity, Long> {}
