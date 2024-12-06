package com.miau.api.controller;

import com.miau.api.domain.cadastro.Cadastro;
import com.miau.api.domain.cadastro.CadastroResquestDTO;
import com.miau.api.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @PostMapping
    public ResponseEntity<Cadastro> create(@RequestBody CadastroResquestDTO body){
        Cadastro novoCadastro = this.cadastroService.createCadastro(body);
        return ResponseEntity.ok(novoCadastro);
    }
}
