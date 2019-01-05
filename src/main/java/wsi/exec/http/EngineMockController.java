package wsi.exec.http;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wsi.exec.model.EngineStatus;
import wsi.exec.service.EngineMock;

import java.util.List;

/**
 * Kontroler symuluje odpowiedzi prawdziwego modułu silnika (rest-y serwowane przez arduino)
 */


@RestController
@CrossOrigin
@Slf4j
public class EngineMockController {
    @Autowired
    EngineMock engine;

    @GetMapping(value = "/temps")
    public List<Double> getAllTemperatures() {
       return engine.getTemps();
    }

    @GetMapping(value = "/start")
    public EngineStatus startEngine() {
        return engine.start();
    }

    @GetMapping(value = "/stop")
    public EngineStatus stopEngine() {
        return engine.stop();
    }

    @GetMapping(value = "/status")
    public EngineStatus statusEngine() {
        return engine.status();
    }

    @GetMapping(value = "/reverse")
    public EngineStatus reverseEngine() {
        return engine.reverse();
    }

}
