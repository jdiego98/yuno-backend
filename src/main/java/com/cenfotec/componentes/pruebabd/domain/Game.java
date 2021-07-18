package com.cenfotec.componentes.pruebabd.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import java.util.Arrays;

@Container(containerName = "game")
public class Game {

    @Id
    private String id;
    @PartitionKey
    private String gameId;
    private String type;
    private String personId;
    private String name;
    private String description;
    private String price;
    private String size;
    private String cover;
    private String picture;
    private String[] platforms;
    private String[] categories;

    public Game(){

    }

    public Game(String id, String gameId, String type, String personId, String name, String description, String price, String size, String cover, String picture, String[] platforms, String[] categories) {
        this.id = id;
        this.gameId = gameId;
        this.type = type;
        this.personId = personId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.cover = cover;
        this.picture = picture;
        this.platforms = platforms;
        this.categories = categories;
    }

    public String getGameID() {
        return gameId;
    }

    public void setGameID(String gameId) {
        this.gameId = gameId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", gameId='" + gameId + '\'' +
                ", type='" + type + '\'' +
                ", personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", cover='" + cover + '\'' +
                ", picture='" + picture + '\'' +
                ", platforms=" + Arrays.toString(platforms) +
                ", categories=" + Arrays.toString(categories) +
                '}';
    }
}
