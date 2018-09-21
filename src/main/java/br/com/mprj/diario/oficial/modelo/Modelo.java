package br.com.mprj.diario.oficial.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Modelo")
public class Modelo implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7763961854372386512L;


	@Id
	private Integer id;
    

	@Column(name = "nome")
	private String nome;
	
    public Modelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modelo(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
}
