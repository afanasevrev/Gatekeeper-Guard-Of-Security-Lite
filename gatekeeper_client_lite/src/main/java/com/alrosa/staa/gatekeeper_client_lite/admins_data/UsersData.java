package com.alrosa.staa.gatekeeper_client_lite.admins_data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class UsersData {
    public StringProperty id;
    public StringProperty first_name;
    public StringProperty middle_name;
    public StringProperty last_name;
    public StringProperty company;
    public StringProperty organization;
    public UsersData() {}
    public UsersData(String id, String first_name, String middle_name, String last_name, String company, String organization) {
        this.id = new SimpleStringProperty(this, "id", id);
        this.first_name = new SimpleStringProperty(this, "first_name", first_name);
        this.middle_name = new SimpleStringProperty(this, "middle_name", middle_name);
        this.last_name = new SimpleStringProperty(this, "last_name", last_name);
        this.company = new SimpleStringProperty(this, "company", company);
        this.organization = new SimpleStringProperty(this, "organization", organization);
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
    public String getCompany() {
        return company.get();
    }
    public StringProperty companyProperty() {
        return company;
    }
    public void setCompany(String company) {
        this.company.set(company);
    }
    public String getOrganization() {
        return organization.get();
    }
    public StringProperty organizationProperty() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization.set(organization);
    }
}
