package com.miau.api.domain.endereco;

import com.miau.api.domain.cadastro.Cadastro;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue
    private UUID id;

    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    @OneToOne
    @JoinColumn(name = "cadastro_id")
    private Cadastro cadastro;
}
