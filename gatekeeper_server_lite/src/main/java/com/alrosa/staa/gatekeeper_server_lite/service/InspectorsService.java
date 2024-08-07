package com.alrosa.staa.gatekeeper_server_lite.service;

import com.alrosa.staa.gatekeeper_server_lite.entity.InspectorsEntity;
import java.util.List;
public interface InspectorsService {
    String createInspector(InspectorsEntity entity);
    List<InspectorsEntity> readInspectors();
    InspectorsEntity readInspector(Long id);
    String deleteInspector(Long id);
    String updateInspector(InspectorsEntity entity, Long id);
}
