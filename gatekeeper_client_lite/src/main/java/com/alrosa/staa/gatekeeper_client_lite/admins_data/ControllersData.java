package com.alrosa.staa.gatekeeper_client_lite.admins_data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class ControllersData {
    public StringProperty id;
    public StringProperty controller_name;
    public StringProperty ip_address;
    public StringProperty status;
    public ControllersData() {}
    public ControllersData(String id, String controller_name, String ip_address, String status) {
        this.id = new SimpleStringProperty(this, "id", id);
        this.controller_name = new SimpleStringProperty(this, "controller_name", controller_name);
        this.ip_address = new SimpleStringProperty(this, "ip_address", ip_address);
        this.status = new SimpleStringProperty(this, "status", status);
    }
    public ControllersData(String id, String controller_name) {
        this.id = new SimpleStringProperty(this, "id", id);
        this.controller_name = new SimpleStringProperty(this, "controller_name", controller_name);
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
    public String getController_name() {
        return controller_name.get();
    }
    public StringProperty controller_nameProperty() {
        return controller_name;
    }
    public void setController_name(String controller_name) {
        this.controller_name.set(controller_name);
    }
    public String getIp_address() {
        return ip_address.get();
    }
    public StringProperty ip_addressProperty() {
        return ip_address;
    }
    public void setIp_address(String ip_address) {
        this.ip_address.set(ip_address);
    }
    public String getStatus() {
        return status.get();
    }
    public StringProperty statusProperty() {
        return status;
    }
    public void setStatus(String status) {
        this.status.set(status);
    }
}
