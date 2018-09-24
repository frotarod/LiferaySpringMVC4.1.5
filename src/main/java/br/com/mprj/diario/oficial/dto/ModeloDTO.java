package br.com.mprj.diario.oficial.dto;

import br.com.mprj.diario.oficial.modelo.Modelo;

import java.io.Serializable;

public class ModeloDTO implements Serializable{

	private static final long serialVersionUID = -3136650007271178424L;

	private Integer id;
	
	private String nome;

	
	
	public ModeloDTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public ModeloDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static Modelo convertoTOModel(ModeloDTO dto){
		return new Modelo(dto.getId(), dto.getNome());
	}
	
	
}
