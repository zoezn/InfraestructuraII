package io.gitlab.mihajlonesic.springawsgitlab.repository;

import io.gitlab.mihajlonesic.springawsgitlab.entity.Game;
import io.gitlab.mihajlonesic.springawsgitlab.model.GameResponse;
import io.gitlab.mihajlonesic.springawsgitlab.model.GameWithConsoleResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("select new io.gitlab.mihajlonesic.springawsgitlab.model.GameWithConsoleResponse(g) " +
           "from Game g where g.releaseYear>2010" +
           "order by g.title, g.releaseYear, g.console.id")
    List<GameWithConsoleResponse> findAllGames();

    @Query("select new io.gitlab.mihajlonesic.springawsgitlab.model.GameResponse(g) " +
           "from Game g " +
           "where g.console.id = :consoleId " +
           "order by g.title, g.releaseYear")
    List<GameResponse> findAllGamesByConsole(@Param("consoleId") Long consoleId);

}
