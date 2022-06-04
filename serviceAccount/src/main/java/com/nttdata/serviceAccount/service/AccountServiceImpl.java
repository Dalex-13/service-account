package com.nttdata.serviceAccount.service;

import com.nttdata.serviceAccount.entitys.Account;
import com.nttdata.serviceAccount.repository.AcoountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService{


    @Autowired
    private AcoountRepository repository;


    @Override
    public Flux<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Account> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Account> save(Account account) {
        return repository.save(account);
    }

    @Override
    public Mono<Account> updateById(String id, Account account) {
        return this.findById(id)
                .flatMap(entity -> this.save(account))
                .switchIfEmpty( Mono.error(new Exception()));
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }
}
