package com.cenfotec.componentes.pruebabd.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@Container(containerName = "Games")
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
    @JsonProperty("platforms")
    private ArrayList<Platform> platforms;
    @JsonProperty("categories")
    private ArrayList<Category> categories;

    public Game() {

    }

    public Game(@JsonProperty("id") String id, @JsonProperty("gameId") String gameId,
                @JsonProperty("type") String type,
                @JsonProperty("personId") String personId,
                @JsonProperty("name") String name,
                @JsonProperty("description") String description,
                @JsonProperty("price") String price,
                @JsonProperty("size") String size,
                @JsonProperty("cover") String cover,
                @JsonProperty("picture") String picture,
                @JsonProperty("platforms") ArrayList<Platform> platforms,
                @JsonProperty("categories") ArrayList<Category> categories) {
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

    public String getId() {
        return id;
    }

    public String getGameId() {
        return gameId;
    }

    public String getType() {
        return type;
    }

    public String getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getCover() {
        return cover;
    }

    public String getPicture() {
        return picture;
    }

    public ArrayList<Platform> getPlatform() {return platforms;}

    public ArrayList<Category> getCategories() {return categories;}

    public void setId(String id) {
        this.id = id;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPlatform(ArrayList<Platform> platforms) {this.platforms = platforms;}

    public void setCategories(ArrayList<Category> categories) {this.categories = categories;}

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
                ", platforms=" + platforms.toString() +
                ", categories=" + categories.toString() +
                '}';
    }
}
