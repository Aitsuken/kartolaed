package kg.kuraido.kartolaed.repository;

import kg.kuraido.kartolaed.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface StatusRepo extends JpaRepository<Status, UUID> {
    @Override
    ArrayList<Status> findAll();
    }
