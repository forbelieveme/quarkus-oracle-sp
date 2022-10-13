package org.acme;

public class StoredProcedureResponseElement {

    private String id;
    private String name;
    private String salary;
    private String dpto;
    private String location;

    public StoredProcedureResponseElement(String id, String name, String salary, String dpto, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dpto = dpto;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
