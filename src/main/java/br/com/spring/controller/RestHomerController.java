package br.com.spring.controller;

import br.com.spring.modelo.Modelo;
import br.com.spring.service.ModeloService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomerController {

	@Autowired
	private ModeloService service;
	
	
	/**
	 * URL to use: http://localhost:8080/liferay-spring-mvc-portlet/services/modelos
	 * 
	 * @return list of users as JSON
	 */
	@RequestMapping(value = "/modelos", method = RequestMethod.GET)
	public ResponseEntity<List<Modelo>> modelos() {
		return new ResponseEntity<List<Modelo>>( service.listAll(), HttpStatus.OK);
	}

}
