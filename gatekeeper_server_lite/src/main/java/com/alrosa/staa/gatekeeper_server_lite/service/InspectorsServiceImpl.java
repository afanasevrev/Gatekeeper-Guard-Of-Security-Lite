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
        InspectorsEntity inspector = inspectorsRepository.findById(id).get();
        inspectorsRepository.delete(inspector);
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
        InspectorsEntity inspector = inspectorsRepository.findById(id).get();
        inspector.setFirst_name(entity.getFirst_name());
        inspector.setMiddle_name(entity.getMiddle_name());
        inspector.setLast_name(entity.getLast_name());
        inspector.setLogin(entity.getLogin());
        inspector.setPassword(entity.getPassword());
        inspector.setCompany(entity.getCompany());
        inspector.setOrganization(entity.getOrganization());
        inspector.setPosition(entity.getPosition());
        inspectorsRepository.save(inspector);
        return "Инспектор бюро пропусков с ID = " + id + " успешно обновлён";
    }
}
