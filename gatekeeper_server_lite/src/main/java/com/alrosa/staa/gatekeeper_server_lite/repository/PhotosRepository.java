package com.alrosa.staa.gatekeeper_server_lite.repository;

import com.alrosa.staa.gatekeeper_server_lite.entity.PhotosEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhotosRepository extends JpaRepository<PhotosEntity, Long> {
        PhotosEntity findByUsersEntity(UsersEntity usersEntity);
}
