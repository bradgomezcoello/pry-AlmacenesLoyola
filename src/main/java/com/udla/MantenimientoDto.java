package com.udla;


import java.util.Map;

public class MantenimientoDto {
    
public String id;
public String form;
public String isNew;
public String sortDate;
public String modificationDate;
public String creationDate;




public MantenimientoDto(String id, String form, String isNew, String sortDate, String modificationDate,
        String creationDate, Map<String, String> valores) {
    this.id = id;
    this.form = form;
    this.isNew = isNew;
    this.sortDate = sortDate;
    this.modificationDate = modificationDate;
    this.creationDate = creationDate;

}

public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getForm() {
    return form;
}
public void setForm(String form) {
    this.form = form;
}
public String getIsNew() {
    return isNew;
}
public void setIsNew(String isNew) {
    this.isNew = isNew;
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




}
