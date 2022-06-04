package com.nttdata.serviceAccount.controller;

import com.nttdata.serviceAccount.entitys.Account;
import com.nttdata.serviceAccount.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService service;

    @PostMapping("/add")
    public Mono<Account> registrar(@RequestBody Account account){
        log.info("creando tipo de cuenta");
        return service.save(account);
    }

    @GetMapping("/listar")
    public Flux<Account> listAll(){
        log.info("listando todas las cuentas");
        return service.findAll();
    }


    @GetMapping("/listar/{id}")
    public Mono<Account> listById(@PathVariable String id){
        log.info("Buscar cliente por Id");
        return service.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Mono<Account> putById(@PathVariable String id, @RequestBody Account account){
        log.info("Actualizar cliente por Id");
        return service.updateById(id, account);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        log.info("Eliminar cliente por Id");
        return service.delete(id);
    }
}
