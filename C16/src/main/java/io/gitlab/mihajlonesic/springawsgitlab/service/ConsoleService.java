package io.gitlab.mihajlonesic.springawsgitlab.service;

import io.gitlab.mihajlonesic.springawsgitlab.model.ConsoleResponse;
import io.gitlab.mihajlonesic.springawsgitlab.repository.ConsoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsoleService {

    @Autowired
    private ConsoleRepository consoleRepository;

    public ConsoleResponse getConsole(Long consoleId) {
        Optional<ConsoleResponse> consoleOptional = consoleRepository.findConsoleById(consoleId);
        if (!consoleOptional.isPresent()) {
            throw new RuntimeException("Console with id " + consoleId + " was not found");
        }
        return consoleOptional.get();
    }

    public List<ConsoleResponse> getAllConsoles() {
        return consoleRepository.findAllConsoles();
    }
}
