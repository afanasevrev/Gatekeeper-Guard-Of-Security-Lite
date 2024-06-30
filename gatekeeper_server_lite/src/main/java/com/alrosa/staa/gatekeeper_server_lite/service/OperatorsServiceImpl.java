package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.OperatorsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.OperatorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * Класс для операций над таблицей "operators" в БД
 */
public class OperatorsServiceImpl implements OperatorsService {
    @Autowired
    private OperatorsRepository operatorsRepository;
    /**
     * Метод добавляет в БД нового оператора
     * @param entity
     * @return Статус выполнения запроса
     */
    @Override
    public String createOperator(OperatorsEntity entity) {
        operatorsRepository.save(entity);
        return "Новый оператор успешно добавлен";
    }
    /**
     * Метод возвращает список операторов из БД
     * @return List
     */
    @Override
    public List<OperatorsEntity> readOperators() {
        return operatorsRepository.findAll();
    }
    /**
     * Метод возвращает оператора из БД по выбранному id
     * @param id
     * @return OperatorsEntity
     */
    @Override
    public OperatorsEntity readOperator(Long id) {
        return operatorsRepository.findById(id).get();
    }
    /**
     * Метод удаляет из БД оператора по выбранному id
     * @param id
     * @return Статус выполнения запроса
     */
    @Override
    public String deleteOperator(Long id) {
        OperatorsEntity operator = operatorsRepository.findById(id).get();
        operatorsRepository.delete(operator);
        return "Оператор с ID = " + id + " успешно удален из БД";
    }
    /**
     * Метод обновляет в БД оператора по выбранному id
     * @param entity
     * @param id
     * @return Статус выполнения запроса
     */
    @Override
    public String updateOperator(OperatorsEntity entity, Long id) {
        OperatorsEntity operators = operatorsRepository.findById(id).get();
        operators.setFirst_name(entity.getFirst_name());
        operators.setMiddle_name(entity.getMiddle_name());
        operators.setLast_name(entity.getLast_name());
        operators.setLogin(entity.getLogin());
        operators.setPassword(entity.getPassword());
        operators.setCompany(entity.getCompany());
        operators.setOrganization(entity.getOrganization());
        operators.setPosition(entity.getPosition());
        return "Оператор с ID = " + id + " успешно обновлен";
    }
}
