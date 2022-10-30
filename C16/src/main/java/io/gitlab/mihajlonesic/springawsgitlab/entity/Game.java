package io.gitlab.mihajlonesic.springawsgitlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Game {

    @Id
    private Long id;
    private String title;
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name = "console_id", referencedColumnName = "id")
    private Console console;

    @Deprecated
    public Game() {
    }

    public static Game create(String title, Integer releaseYear, Console console) {
        Game game = new Game();
        game.setTitle(title);
        game.setReleaseYear(releaseYear);
        game.setConsole(console);
        return game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        if (releaseYear < 0) {
            throw new NumberFormatException("Game release year must be a positive number");
        }
        this.releaseYear = releaseYear;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }
}
