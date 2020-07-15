package io.github.joaoroche.agendaapi.model.repository;

import io.github.joaoroche.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepositoy extends JpaRepository<Contato, Integer> {
}
