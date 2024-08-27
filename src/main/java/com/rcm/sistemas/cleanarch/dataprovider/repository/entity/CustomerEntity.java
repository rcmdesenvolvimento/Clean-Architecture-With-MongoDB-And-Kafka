package com.rcm.sistemas.cleanarch.dataprovider.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "customers")
public class CustomerEntity {

    @Id
    private String id;

    private String nome;
    private AddressEntity address;
    private String cpf;
    private Boolean validCpf;
}
