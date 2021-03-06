package com.example.valentina.valentina_libruary.Object;

import io.realm.RealmObject;
import io.realm.annotations.Index;

/**
 * Created by Valentina on 29.03.2018.
 */

public class Book extends RealmObject {

    @Index
    //public String id;
    public String name;
    public String author;
    public String category;
    public String link;
    //public String status;
    public String description;
    public String image;

    /*public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
