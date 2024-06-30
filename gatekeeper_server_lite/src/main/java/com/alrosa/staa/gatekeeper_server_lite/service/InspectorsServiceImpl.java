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
    @Override
    public List<InspectorsEntity> readUsers() {
        return inspectorsRepository.findAll();
    }
    @Override
    public InspectorsEntity readInspector(Long id) {
        return inspectorsRepository.findById(id).get();
    }
    @Override
    public String deleteInspector(Long id) {
        InspectorsEntity inspectorsEntity = inspectorsRepository.findById(id).get();
        inspectorsRepository.delete(inspectorsEntity);
        return "Инспектор бюро пропусков с ID = " + id + " успешно удален из базы";
    }
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
