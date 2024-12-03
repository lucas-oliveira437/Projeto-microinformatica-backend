package com.miau.api.repositories;

import com.miau.api.domain.contato.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContatoRepository extends JpaRepository<Contato, UUID> {
}
