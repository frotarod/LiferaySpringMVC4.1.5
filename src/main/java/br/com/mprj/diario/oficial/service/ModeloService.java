package br.com.mprj.diario.oficial.service;

import br.com.mprj.diario.oficial.modelo.Modelo;

import java.util.List;

public interface ModeloService {
	public void salva(Modelo modelo);
	public List<Modelo> listAll();
	public void deleteAll();
}
