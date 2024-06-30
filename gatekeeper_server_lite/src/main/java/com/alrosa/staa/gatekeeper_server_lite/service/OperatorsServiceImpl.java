package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.OperatorsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.OperatorsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OperatorsServiceImpl implements OperatorsService {
    @Autowired
    private OperatorsRepository operatorsRepository;
    @Override
    public String createOperator(OperatorsEntity entity) {
        operatorsRepository.save(entity);
        return "Новый оператор успешно добавлен";
    }
    @Override
    public List<OperatorsEntity> readOperators() {
        return operatorsRepository.findAll();
    }
    @Override
    public OperatorsEntity readOperator(Long id) {
        return operatorsRepository.findById(id).get();
    }
    @Override
    public String deleteOperator(Long id) {
        OperatorsEntity operator = operatorsRepository.findById(id).get();
        operatorsRepository.delete(operator);
        return "Оператор с ID = " + id + " успешно удален из БД";
    }
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
