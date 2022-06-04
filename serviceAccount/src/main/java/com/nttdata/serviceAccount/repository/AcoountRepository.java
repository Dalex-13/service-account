package com.nttdata.serviceAccount.repository;

import com.nttdata.serviceAccount.entitys.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcoountRepository extends ReactiveCrudRepository<Account, String> {
}
