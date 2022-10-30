package io.gitlab.mihajlonesic.springawsgitlab.model;

import io.gitlab.mihajlonesic.springawsgitlab.entity.Console;

public class ConsoleResponse {

    private Long id;
    private String name;
    private Integer releaseYear;

    public ConsoleResponse() {
    }

    public ConsoleResponse(Console console) {
        this.id = console.getId();
        this.name = console.getName();
        this.releaseYear = console.getReleaseYear();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }
}
