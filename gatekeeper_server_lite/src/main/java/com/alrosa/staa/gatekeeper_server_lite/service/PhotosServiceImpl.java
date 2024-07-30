package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.PhotosEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.PhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * Класс для взаимодействия с фотографиями в БД
 */
@Service
public class PhotosServiceImpl implements PhotosService {
    @Autowired
    private PhotosRepository photosRepository;
    /**
     * Метод добавляет в БД новую фотографию
     * @param entity
     * @return Статус выполнения запроса
     */
    @Override
    public String createPhoto(PhotosEntity entity) {
        photosRepository.save(entity);
        return "Новая фотография успешно добавлена";
    }
    /**
     * Метод возвращает все фотографии из БД
     * @return List
     */
    @Override
    public List<PhotosEntity> readPhotos() {
        return photosRepository.findAll();
    }
    /**
     * Метод возвращает фотографию из БД по выбранному id
     * @param id
     * @return PhotosEntity
     */
    @Override
    public PhotosEntity readPhoto(Long id) {
        return photosRepository.findById(id).get();
    }
    /**
     * Метод удаляет из БД фотографию по выбранному id
     * @param id
     * @return Статус выполнения запроса
     */
    @Override
    public String deletePhoto(Long id) {
        PhotosEntity photosEntity = photosRepository.findById(id).get();
        photosRepository.delete(photosEntity);
        return "Фотография с ID = " + id + " успешно удалена из БД";
    }
    /**
     * Метод обновляет в БД по выбранному id
     * @param entity
     * @param id
     * @return Статус выполнения запроса
     */
    @Override
    public String updatePhoto(PhotosEntity entity, Long id) {
        PhotosEntity photosEntity = photosRepository.findById(id).get();
        photosEntity.setUserPhoto(entity.getUserPhoto());
        return "Фотография с ID = " + id + " успешно обновлена в БД";
    }
}
