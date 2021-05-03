package br.com.alura.microservico.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservico.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
