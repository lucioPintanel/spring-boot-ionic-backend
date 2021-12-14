package com.lucioPintanel.spring_ionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucioPintanel.spring_ionic.domain.Cliente;
import com.lucioPintanel.spring_ionic.repositories.ClienteRepository;
import com.lucioPintanel.spring_ionic.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado!" + "Id: " + id + " " + "Tipo: " + Cliente.class.getName()));
	}
}
