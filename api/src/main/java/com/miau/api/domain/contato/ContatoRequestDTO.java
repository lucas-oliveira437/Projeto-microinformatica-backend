package com.miau.api.domain.contato;

public record ContatoRequestDTO(String nome_completo, String email, String telefone,
                                String mensagem) {
}
