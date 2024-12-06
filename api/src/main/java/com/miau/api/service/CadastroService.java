package com.miau.api.service;

import com.miau.api.domain.cadastro.Cadastro;
import com.miau.api.domain.cadastro.CadastroResquestDTO;

import com.miau.api.repositories.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;


@Service
public class CadastroService {

    @Autowired
    private CadastroRepository repository;
    public Cadastro createCadastro(CadastroResquestDTO data){
        LocalDate nascimento = LocalDate.parse(data.data_nascimento());
        Cadastro novoCadastro = new Cadastro();
        novoCadastro.setNome_completo(data.nome_completo());
        novoCadastro.setNome_social(data.nome_social());
        novoCadastro.setData_nascimento(nascimento);
        novoCadastro.setGenero(data.genero());
        novoCadastro.setEmail(data.email());
        novoCadastro.setSenha(data.senha());
        novoCadastro.setCep(data.cep());
        novoCadastro.setLogradouro(data.logradouro());
        novoCadastro.setNumero(data.numero());
        novoCadastro.setBairro(data.bairro());
        novoCadastro.setCidade(data.cidade());
        novoCadastro.setEstado(data.estado());
        novoCadastro.setInteresse(data.interesse());
        repository.save(novoCadastro);

        return novoCadastro;
    }
}
