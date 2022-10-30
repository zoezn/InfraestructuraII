package io.gitlab.mihajlonesic.springawsgitlab.model;

import io.gitlab.mihajlonesic.springawsgitlab.entity.Game;

public class GameResponse {

    private Long id;
    private String title;
    private Integer releaseYear;

    public GameResponse() {
    }

    public GameResponse(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.releaseYear = game.getReleaseYear();
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
        this.releaseYear = releaseYear;
    }
}
