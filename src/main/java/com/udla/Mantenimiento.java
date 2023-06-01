package com.udla;

import java.util.HashMap;
import java.util.Map;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Mantenimiento extends PanacheMongoEntity{
    
    public String idMantenimiento;
    public String sortDate;
    public String modificationDate;
    public String creationDate;
    Map<String,String> valores = new HashMap<>();

    
    public Mantenimiento(String idMantenimiento, String sortDate, String modificationDate,
        String creationDate, Map<String, String> valores) {
        this.idMantenimiento= idMantenimiento;
        this.sortDate = sortDate;
        this.modificationDate = modificationDate;
        this.creationDate = creationDate;
        this.valores = valores;
    }

    


    public Mantenimiento() {
    }




    public String getIdMantenimiento() {
        return idMantenimiento;
    }


    public void setIdMantenimiento(String idMantenimiento) {
        this.idMantenimiento= idMantenimiento;
    }


    public String getSortDate() {
        return sortDate;
    }


    public void setSortDate(String sortDate) {
        this.sortDate = sortDate;
    }


    public String getModificationDate() {
        return modificationDate;
    }


    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }


    public String getCreationDate() {
        return creationDate;
    }


    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


    public Map<String, String> getValores() {
        return valores;
    }


    public void setValores(Map<String, String> valores) {
        this.valores = valores;
    }


    
}
