package com.miau.api.controller;


import com.miau.api.domain.cadastro.Cadastro;
import com.miau.api.domain.cadastro.CadastroResquestDTO;
import com.miau.api.domain.contato.Contato;
import com.miau.api.domain.contato.ContatoRequestDTO;
import com.miau.api.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping
    public ResponseEntity<Contato> create(@RequestBody ContatoRequestDTO body){
        Contato novoContato = this.contatoService.createContato(body);
        return ResponseEntity.ok(novoContato);
    }
}
