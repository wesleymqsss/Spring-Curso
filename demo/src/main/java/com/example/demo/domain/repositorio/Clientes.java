package com.example.demo.domain.repositorio;
import com.example.demo.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);
}
