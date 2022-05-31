package kg.kuraido.kartolaed.service;

import kg.kuraido.kartolaed.exception.AccountNotFoundException;
import kg.kuraido.kartolaed.model.Account;
import kg.kuraido.kartolaed.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account addAccount(Account account){
        account.setId(UUID.randomUUID());
        account.setActive(true);
        account.setDateCreated(new Timestamp(new Date().getTime()));
        return accountRepository.save(account);
    }

    public List<Account> findAllAccounts(){
        return accountRepository.findAll();
    }

    public Account updateAccount(Account account){
        return accountRepository.save(account);
    }

    public Account findAccountById(UUID id){
        return accountRepository.findAccountById(id)
                .orElseThrow(() -> new AccountNotFoundException("User was not found with id " + id));
    }
    public void deleteAccount(UUID id){
         accountRepository.deleteAccountById(id);
    }
}
