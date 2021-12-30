package com.lucioPintanel.spring_ionic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucioPintanel.spring_ionic.domain.Pedido;
import com.lucioPintanel.spring_ionic.repositories.PedidoRepository;
import com.lucioPintanel.spring_ionic.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado!" + "Id: " + id + " " + "Tipo: " + Pedido.class.getName()));
	}
}
