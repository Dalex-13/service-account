package com.nttdata.serviceAccount.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Account")
public class Account {

    @Id
    private String id;
    private String accountType;//tipo de cuenta
    private String accountNumber;//numeor de cuenta
    private String password;//contraseña
    private String availableBalance;//saldo disponible

    @JsonFormat(pattern="dd-MM-yyyy hh:mm:ss", timezone="GMT-05:00")
    private String creationDate;//creacion de fecha
    private String accountStatus;//estado de cuenta
    private String idCustomer;//id de usuario

}
