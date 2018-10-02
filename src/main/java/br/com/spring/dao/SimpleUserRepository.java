package br.com.spring.dao;

import br.com.spring.modelo.Modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleUserRepository extends JpaRepository<Modelo, Integer> {}
