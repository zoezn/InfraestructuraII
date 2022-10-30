package io.gitlab.mihajlonesic.springawsgitlab.service;

import io.gitlab.mihajlonesic.springawsgitlab.model.GameResponse;
import io.gitlab.mihajlonesic.springawsgitlab.model.GameWithConsoleResponse;
import io.gitlab.mihajlonesic.springawsgitlab.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameWithConsoleResponse> getAllGames() {
        return gameRepository.findAllGames();
    }

    public List<GameResponse> getAllGamesByConsole(Long consoleId) {
        return gameRepository.findAllGamesByConsole(consoleId);
    }
}
