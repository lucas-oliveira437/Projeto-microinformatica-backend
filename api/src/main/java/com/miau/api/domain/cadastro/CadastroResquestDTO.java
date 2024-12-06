package com.miau.api.domain.cadastro;


import java.util.Date;

public record CadastroResquestDTO(String nome_completo, String nome_social, String data_nascimento,
                                  String genero, String email, String senha, String cep, String logradouro,
                                  String numero, String bairro, String cidade, String estado,
                                  String interesse) {
}
