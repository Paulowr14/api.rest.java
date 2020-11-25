package com.barbearia.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbearia.apirest.model.Cliente;
import com.barbearia.apirest.repository.ClienteRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	//Get é utilizado para realizar buscas
	
	@GetMapping("/clientes")
	public List<Cliente> ListaClientes(){
		return clienteRepository.findAll();
		
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente clientebyid(@PathVariable(value = "id")long id){
		return clienteRepository.findById(id);
		
	}
	
	//post é o que cria um registro
	@PostMapping("/cliente")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}
	//put é que atualiza um registro
	@PutMapping("/cliente")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	//Delete não utiliza return pq não retorna nada.
	@DeleteMapping("/cliente")
	public void  deleteCliente(@RequestBody Cliente cliente) {
		 clienteRepository.delete(cliente);	
		}


}
