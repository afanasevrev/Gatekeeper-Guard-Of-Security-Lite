package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.ControllersEntity;
import java.util.List;
public interface ControllersService {
    String createController(ControllersEntity entity);
    List<ControllersEntity> readControllers();
    ControllersEntity readController(Long id);
    String deleteController(Long id);
    String updateController(ControllersEntity entity, Long id);
}
