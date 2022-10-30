package io.gitlab.mihajlonesic.springawsgitlab.repository;

import io.gitlab.mihajlonesic.springawsgitlab.entity.Console;
import io.gitlab.mihajlonesic.springawsgitlab.model.ConsoleResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConsoleRepository extends JpaRepository<Console, Long> {

    @Query("select new io.gitlab.mihajlonesic.springawsgitlab.model.ConsoleResponse(c) " +
           "from Console c " +
           "where c.id = :consoleId")
    Optional<ConsoleResponse> findConsoleById(@Param("consoleId") Long consoleId);

    @Query("select new io.gitlab.mihajlonesic.springawsgitlab.model.ConsoleResponse(c) " +
           "from Console c " +
           "order by c.releaseYear")
    List<ConsoleResponse> findAllConsoles();
}
