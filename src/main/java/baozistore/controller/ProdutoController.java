package baozistore.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import baozistore.model.Produto;
import baozistore.repository.ProdutoRepository;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private final ProdutoRepository repository;
	
	public ProdutoController(ProdutoRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public Produto cadastrar(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@GetMapping
	public List<Produto> listar() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
		return repository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Long id) {
		if (!repository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
