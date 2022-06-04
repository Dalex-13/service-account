package com.nttdata.serviceAccount.service;

import com.nttdata.serviceAccount.entitys.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    public Flux<Account> findAll();

    public Mono<Account> findById(String id);

    public Mono<Account> save(Account account);

    public Mono<Account> updateById(String id, Account account);

    public Mono<Void> delete(String id);
}
