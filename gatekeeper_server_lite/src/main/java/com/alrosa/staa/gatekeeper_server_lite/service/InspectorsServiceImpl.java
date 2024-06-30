package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.InspectorsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.InspectorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * Класс для операций над таблицей "inspector" в БД
 */
public class InspectorsServiceImpl implements InspectorsService {
    @Autowired
    private InspectorsRepository inspectorsRepository;
    /**
     * Метод добавляет в БД нового инспектора бюро пропусков
     * @param entity
     * @return статус выполнения запроса
     */
    @Override
    public String createInspector(InspectorsEntity entity) {
       inspectorsRepository.save(entity);
       return "Новый инспектор бюро пропусков успешно добавлен";
    }
    /**
     * Метод возвращает из БД список инспекторов бюро пропусков
     * @return List
     */
    @Override
    public List<InspectorsEntity> readUsers() {
        return inspectorsRepository.findAll();
    }
    /**
     * Метод возвращает из БД одного инспектора по выбранному id
     * @param id
     * @return InspectorsEntity
     */
    @Override
    public InspectorsEntity readInspector(Long id) {
        return inspectorsRepository.findById(id).get();
    }
    /**
     * Метод удаляет из БД инспектора бюро пропусков по выбранному id
     * @param id
     * @return Статус выполнения запроса
     */
    @Override
    public String deleteInspector(Long id) {
        InspectorsEntity inspectorsEntity = inspectorsRepository.findById(id).get();
        inspectorsRepository.delete(inspectorsEntity);
        return "Инспектор бюро пропусков с ID = " + id + " успешно удален из базы";
    }
    /**
     * Метод обновляет данные инспектора бюро пропусков в БД по выбранному id
     * @param entity
     * @param id
     * @return Статус выполнения запроса
     */
    @Override
    public String updateInspector(InspectorsEntity entity, Long id) {
        InspectorsEntity inspectorsEntity = inspectorsRepository.findById(id).get();
        inspectorsEntity.setFirst_name(entity.getFirst_name());
        inspectorsEntity.setMiddle_name(entity.getMiddle_name());
        inspectorsEntity.setLast_name(entity.getLast_name());
        inspectorsEntity.setLogin(entity.getLogin());
        inspectorsEntity.setPassword(entity.getPassword());
        inspectorsEntity.setCompany(entity.getCompany());
        inspectorsEntity.setOrganization(entity.getOrganization());
        inspectorsEntity.setPosition(entity.getPosition());
        inspectorsRepository.save(inspectorsEntity);
        return "Инспектор бюро пропусков с ID = " + id + " успешно обновлён";
    }
}
