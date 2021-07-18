package com.cenfotec.componentes.pruebabd.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "Prueba")
public class Prueba {

    @Id
    private String id;
    @PartitionKey
    private String pruebaId;


    public Prueba(String id, String pruebaId) {
        this.id = id;
        this.pruebaId = pruebaId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPruebaId() {
        return pruebaId;
    }

    public void setPruebaId(String pruebaId) {
        this.pruebaId = pruebaId;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "id='" + id + '\'' +
                ", pruebaId='" + pruebaId + '\'' +
                '}';
    }
}
