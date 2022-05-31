package kg.kuraido.kartolaed.service;

import kg.kuraido.kartolaed.model.Status;
import kg.kuraido.kartolaed.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class StatusService {

    final StatusRepo statusRepo;

    public StatusService(StatusRepo statusRepo) {
        this.statusRepo = statusRepo;
    }

    public Status save(Status status){
        status.setId(UUID.randomUUID());
        status.setUploadTime(new Timestamp(new Date().getTime()));
        return statusRepo.save(status);
    }

    public ArrayList<Status> getAll(){
        return statusRepo.findAll();
    }
}
