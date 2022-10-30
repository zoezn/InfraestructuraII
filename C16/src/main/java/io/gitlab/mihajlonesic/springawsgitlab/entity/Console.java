package io.gitlab.mihajlonesic.springawsgitlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Console {

    @Id
    private Long id;
    private String name;
    private Integer releaseYear;

    @Deprecated
    public Console() {
    }

    public static Console create(String name, Integer releaseYear) {
        Console console = new Console();
        console.setName(name);
        console.setReleaseYear(releaseYear);
        return console;
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
        if (releaseYear < 0) {
            throw new NumberFormatException("Console release year must be a positive number");
        }
        this.releaseYear = releaseYear;
    }
}
