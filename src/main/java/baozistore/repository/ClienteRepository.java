package baozistore.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import baozistore.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}