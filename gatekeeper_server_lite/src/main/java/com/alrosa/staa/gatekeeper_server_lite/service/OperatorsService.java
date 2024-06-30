package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.OperatorsEntity;
import java.util.List;
public interface OperatorsService {
    String createOperator(OperatorsEntity entity);
    List<OperatorsEntity> readOperators();
    OperatorsEntity readOperator(Long id);
    String deleteOperator(Long id);
    String updateOperator(OperatorsEntity entity, Long id);
}
