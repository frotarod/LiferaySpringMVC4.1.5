package br.com.spring.service;

import br.com.spring.modelo.Modelo;

import java.util.List;

public interface ModeloService {
	public void salva(Modelo modelo);
	public List<Modelo> listAll();
	public void deleteAll();
}
