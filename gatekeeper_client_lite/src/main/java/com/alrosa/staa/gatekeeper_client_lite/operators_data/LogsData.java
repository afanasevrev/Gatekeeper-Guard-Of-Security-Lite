package com.alrosa.staa.gatekeeper_client_lite.operators_data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 * Класс для заполнения таблицы
 */
public class LogsData {
    public StringProperty date;
    public StringProperty controllerName;
    public StringProperty direction;
    public StringProperty user;
    public StringProperty access;
    public LogsData() {}
    public LogsData(String date, String controllerName, String direction, String user, String access) {
        this.date = new SimpleStringProperty(this, "date", date);
        this.controllerName = new SimpleStringProperty(this, "controllerName", controllerName);
        this.direction = new SimpleStringProperty(this, "direction", direction);
        this.user = new SimpleStringProperty(this, "user", user);
        this.access = new SimpleStringProperty(this, "access", access);
    }
    public String getDate() {
        return date.get();
    }
    public StringProperty dateProperty() {
        return date;
    }
    public void setDate(String date) {
        this.date.set(date);
    }
    public String getControllerName() {
        return controllerName.get();
    }
    public StringProperty controllerNameProperty() {
        return controllerName;
    }
    public void setControllerName(String controllerName) {
        this.controllerName.set(controllerName);
    }
    public String getDirection() {
        return direction.get();
    }
    public StringProperty directionProperty() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction.set(direction);
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
    public String getAccess() {
        return access.get();
    }
    public StringProperty accessProperty() {
        return access;
    }
    public void setAccess(String access) {
        this.access.set(access);
    }
}
