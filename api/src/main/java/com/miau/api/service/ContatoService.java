package com.miau.api.service;

import com.miau.api.domain.contato.Contato;
import com.miau.api.domain.contato.ContatoRequestDTO;
import com.miau.api.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public Contato createContato(ContatoRequestDTO data){
        Contato novoContato = new Contato();
        novoContato.setNome_completo(data.nome_completo());
        novoContato.setEmail(data.email());
        novoContato.setTelefone(data.telefone());
        novoContato.setMensagem(data.mensagem());

        repository.save(novoContato);

        return novoContato;
    }
}
