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
        return "Новый оператор успешно добавлен";
    }
    @Override
    public List<OperatorsEntity> readOperators() {
        return null;
    }
    @Override
    public OperatorsEntity readOperator(Long id) {
        return null;
    }
    @Override
    public String deleteOperator(Long id) {
        return null;
    }
    @Override
    public String updateOperator(OperatorsEntity entity, Long id) {
        return null;
    }
}
