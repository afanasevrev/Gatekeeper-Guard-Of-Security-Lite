package com.alrosa.staa.gatekeeper_client_lite.data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AccessLevelsData {
    public StringProperty id;
    public StringProperty access_level;
    public StringProperty controllers;
    public AccessLevelsData() {}
    public AccessLevelsData(String id, String access_level, String controllers) {
        this.id = new SimpleStringProperty(this, "id", id);
        this.access_level = new SimpleStringProperty(this, "access_level", access_level);
        this.controllers = new SimpleStringProperty(this, "controllers", controllers);
    }
    public String getId() {
        return id.get();
    }
    public StringProperty idProperty() {
        return id;
    }
    public void setId(String id) {
        this.id.set(id);
    }
    public String getAccess_level() {
        return access_level.get();
    }
    public StringProperty access_levelProperty() {
        return access_level;
    }
    public void setAccess_level(String access_level) {
        this.access_level.set(access_level);
    }
    public String getControllers() {
        return controllers.get();
    }
    public StringProperty controllersProperty() {
        return controllers;
    }
    public void setControllers(String controllers) {
        this.controllers.set(controllers);
    }
}
