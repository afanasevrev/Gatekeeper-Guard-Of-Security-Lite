package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.PhotosEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.PhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * Класс для взаимодействия с фотографиями в БД
 */
public class PhotosServiceImpl implements PhotosService {
    @Autowired
    private PhotosRepository photosRepository;

    @Override
    public String createPhoto(PhotosEntity entity) {
        return null;
    }

    @Override
    public List<PhotosEntity> readPhotos() {
        return null;
    }

    @Override
    public PhotosEntity readPhoto(Long id) {
        return null;
    }

    @Override
    public String deletePhoto(Long id) {
        return null;
    }

    @Override
    public String updatePhoto(PhotosEntity entity, Long id) {
        return null;
    }
}
