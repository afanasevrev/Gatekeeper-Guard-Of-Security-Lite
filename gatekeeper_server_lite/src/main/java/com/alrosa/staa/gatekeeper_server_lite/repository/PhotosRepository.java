package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.PhotosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotosRepository extends JpaRepository<PhotosEntity, Long> {}
