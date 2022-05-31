package kg.kuraido.kartolaed.controller;

import kg.kuraido.kartolaed.model.Status;
import kg.kuraido.kartolaed.repository.StatusRepo;
import kg.kuraido.kartolaed.service.StatusService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status){
        return statusService.save(status);
    }

    @GetMapping("/getAll")
    public ArrayList<Status> getAll(){
        return statusService.getAll();
    }
}
