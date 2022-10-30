package io.gitlab.mihajlonesic.springawsgitlab.controller;

import io.gitlab.mihajlonesic.springawsgitlab.config.Path;
import io.gitlab.mihajlonesic.springawsgitlab.model.GameResponse;
import io.gitlab.mihajlonesic.springawsgitlab.model.GameWithConsoleResponse;
import io.gitlab.mihajlonesic.springawsgitlab.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Path.API)
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = Path.GAMES, method = RequestMethod.GET)
    public ResponseEntity<List<GameWithConsoleResponse>> getAllGames() {
        return ResponseEntity.ok(gameService.getAllGames());
    }

    @RequestMapping(value = Path.CONSOLE_GAMES, method = RequestMethod.GET)
    public ResponseEntity<List<GameResponse>> getAllGames(@PathVariable("id") Long id) {
        return ResponseEntity.ok(gameService.getAllGamesByConsole(id));
    }
}
