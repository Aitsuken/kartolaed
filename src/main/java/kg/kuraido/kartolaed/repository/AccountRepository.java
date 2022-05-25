package kg.kuraido.kartolaed.repository;

import kg.kuraido.kartolaed.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    void deleteAccountById(Long Id);

    Optional<Account> findAccountById(Long id);
}
