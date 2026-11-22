package baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import baozistore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
