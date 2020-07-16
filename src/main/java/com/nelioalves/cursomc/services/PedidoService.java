package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * Classe de serviço
 * @author Nelio Santos
 *
 */
@Service
public class PedidoService {

	@Autowired
	private PedidoRepository categoriaRepository;
	
	public Pedido find(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
