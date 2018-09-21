package br.com.mprj.diario.oficial.dao;

import br.com.mprj.diario.oficial.modelo.Modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleUserRepository extends JpaRepository<Modelo, Integer> {

}
