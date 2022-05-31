package kg.kuraido.kartolaed.repository;

import kg.kuraido.kartolaed.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    void deleteAccountById(UUID Id);

    Optional<Account> findAccountById(UUID id);
}
