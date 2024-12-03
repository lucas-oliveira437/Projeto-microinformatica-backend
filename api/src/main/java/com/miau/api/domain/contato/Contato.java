package com.miau.api.domain.contato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "contato")
@Entity
public class Contato {
    @Id
    @GeneratedValue
    private UUID id;

    private String nomeCompleto;
    private String email;
    private String telefone;
    private String mensagem;

}
