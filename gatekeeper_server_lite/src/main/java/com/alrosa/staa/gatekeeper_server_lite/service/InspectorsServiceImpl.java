package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.InspectorsEntity;
import com.alrosa.staa.gatekeeper_server_lite.repository.InspectorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class InspectorsServiceImpl implements InspectorsService {
    @Autowired
    private InspectorsRepository inspectorsRepository;
    @Override
    public String createInspector(InspectorsEntity entity) {
        return null;
    }
    @Override
    public List<InspectorsEntity> readUsers() {
        return null;
    }
    @Override
    public InspectorsEntity readInspector(Long id) {
        return null;
    }
    @Override
    public String deleteInspector(Long id) {
        return null;
    }
    @Override
    public String updateInspector(InspectorsEntity entity, Long id) {
        return null;
    }
}
