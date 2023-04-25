package com.marcinator.sqlbinder.models;

import jakarta.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length=50, nullable=false, unique=false)
    private String heading;
    @Column(length=300, nullable=false, unique=false)
    private String content;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getID() {
        return id;
    }
}
