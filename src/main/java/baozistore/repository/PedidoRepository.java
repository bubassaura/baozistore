package baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import baozistore.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
