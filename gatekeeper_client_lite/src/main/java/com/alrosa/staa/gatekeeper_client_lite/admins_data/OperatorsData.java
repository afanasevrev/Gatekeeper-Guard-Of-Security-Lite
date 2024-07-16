package com.alrosa.staa.gatekeeper_client_lite.admins_data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OperatorsData {
    public StringProperty id;
    public StringProperty first_name;
    public StringProperty middle_name;
    public StringProperty last_name;
    public StringProperty login;
    public OperatorsData() {}
    public OperatorsData(String id, String first_name, String middle_name, String last_name, String login) {
        this.id = new SimpleStringProperty(this, "id", id);
        this.first_name = new SimpleStringProperty(this, "first_name", first_name);
        this.middle_name = new SimpleStringProperty(this, "middle_name", middle_name);
        this.last_name = new SimpleStringProperty(this, "last_name", last_name);
        this.login = new SimpleStringProperty(this, "login", login);
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
    public String getFirst_name() {
        return first_name.get();
    }
    public StringProperty first_nameProperty() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }
    public String getMiddle_name() {
        return middle_name.get();
    }
    public StringProperty middle_nameProperty() {
        return middle_name;
    }
    public void setMiddle_name(String middle_name) {
        this.middle_name.set(middle_name);
    }
    public String getLast_name() {
        return last_name.get();
    }
    public StringProperty last_nameProperty() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name.set(last_name);
    }
    public String getLogin() {
        return login.get();
    }
    public StringProperty loginProperty() {
        return login;
    }
    public void setLogin(String login) {
        this.login.set(login);
    }
}
