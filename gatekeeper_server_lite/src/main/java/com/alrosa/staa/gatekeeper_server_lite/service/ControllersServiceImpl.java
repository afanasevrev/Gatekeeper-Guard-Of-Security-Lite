package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.ControllersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.ControllersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ControllersServiceImpl implements ControllersService {
    @Autowired
    private ControllersRepository controllersRepository;
    @Override
    public String createController(ControllersEntity entity) {
        controllersRepository.save(entity);
        return "Контроллер успешно добавлен в БД";
    }
    @Override
    public List<ControllersEntity> readControllers() {
        return controllersRepository.findAll();
    }
    @Override
    public ControllersEntity readController(Long id) {
        return null;
    }
    @Override
    public String deleteController(Long id) {
        return null;
    }
    @Override
    public String updateController(ControllersEntity entity, Long id) {
        return null;
    }
}
