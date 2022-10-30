package io.gitlab.mihajlonesic.springawsgitlab.controller;

import io.gitlab.mihajlonesic.springawsgitlab.config.Path;
import io.gitlab.mihajlonesic.springawsgitlab.model.ConsoleResponse;
import io.gitlab.mihajlonesic.springawsgitlab.service.ConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Path.API)
public class ConsoleController {

    @Autowired
    private ConsoleService consoleService;

    @RequestMapping(value = Path.CONSOLE_SINGLE, method = RequestMethod.GET)
    public ResponseEntity<ConsoleResponse> getConsoleById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(consoleService.getConsole(id));
    }

    @RequestMapping(value = Path.CONSOLES, method = RequestMethod.GET)
    public ResponseEntity<List<ConsoleResponse>> getAllConsoles() {
        return ResponseEntity.ok(consoleService.getAllConsoles());
    }

}
