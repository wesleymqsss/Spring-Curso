package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Cliente;
import com.example.demo.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos  extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente(Cliente cliente);
}
