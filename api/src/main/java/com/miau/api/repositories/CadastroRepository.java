package com.miau.api.repositories;

import com.miau.api.domain.cadastro.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CadastroRepository extends JpaRepository<Cadastro, UUID> {
}
