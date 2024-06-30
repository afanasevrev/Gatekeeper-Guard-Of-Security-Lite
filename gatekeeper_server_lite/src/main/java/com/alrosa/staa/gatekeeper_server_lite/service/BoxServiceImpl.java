package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.AdminsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.OperatorsEntity;
import com.alrosa.staa.gatekeeper_server_lite.entity.UsersEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.AdminsRepository;
import com.alrosa.staa.gatekeeper_server_lite.repository.OperatorsRepository;
import com.alrosa.staa.gatekeeper_server_lite.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class BoxServiceImpl<T> implements BoxService<T> {
    @Autowired
    private AdminsRepository adminsRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private OperatorsRepository operatorsRepository;
    @Override
    public String createBox(T entity) {
        if (entity instanceof AdminsEntity) {
            adminsRepository.save((AdminsEntity) entity);
        } else if (entity instanceof UsersEntity) {
            usersRepository.save((UsersEntity) entity);
        } else if (entity instanceof OperatorsEntity) {
            operatorsRepository.save((OperatorsEntity) entity);
        }
        return "Успешно добавлено";
    }
    @Override
    public List<T> readBox() {
        return null;
    }
    @Override
    public T readT(Long id) {
        return null;
    }
    @Override
    public String deleteT(Long id) {
        return null;
    }
    @Override
    public String updateT(T entity, Long id) {
        return null;
    }
}
