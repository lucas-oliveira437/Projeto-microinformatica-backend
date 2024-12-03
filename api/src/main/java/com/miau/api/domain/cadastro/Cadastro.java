package com.miau.api.domain.cadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Table(name = "cadastro")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cadastro {
    @Id
    @GeneratedValue
    private UUID id;
    private String nomeCompleto;
    private String nomeSocial;
    private Date dataNascimento;
    private Genero genero;
    private String email;
    private String senha;
    private LocalDateTime dataDoCadastro;

}
