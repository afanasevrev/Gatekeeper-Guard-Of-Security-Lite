package com.alrosa.staa.gatekeeper_client_lite.admins_data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class CardsData {
    public StringProperty id;
    public StringProperty identifier;
    public StringProperty user;
    public StringProperty access_level;
    public CardsData() {}
    public CardsData(String id, String identifier, String user, String access_level) {
        this.id = new SimpleStringProperty(this, "id", id);
        this.identifier = new SimpleStringProperty(this, "identifier", identifier);
        this.user = new SimpleStringProperty(this, "user", user);
        this.access_level = new SimpleStringProperty(this, "access_level", access_level);
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
    public String getIdentifier() {
        return identifier.get();
    }
    public StringProperty identifierProperty() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier.set(identifier);
    }
    public String getUser() {
        return user.get();
    }
    public StringProperty userProperty() {
        return user;
    }
    public void setUser(String user) {
        this.user.set(user);
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
}
