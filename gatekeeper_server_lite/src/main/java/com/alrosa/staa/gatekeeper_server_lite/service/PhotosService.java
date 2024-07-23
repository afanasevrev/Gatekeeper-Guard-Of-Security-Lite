package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.PhotosEntity;
import java.util.List;
public interface PhotosService {
    String createPhoto(PhotosEntity entity);
    List<PhotosEntity> readPhotos();
    PhotosEntity readPhoto(Long id);
    String deletePhoto(Long id);
    String updatePhoto(PhotosEntity entity, Long id);
}
