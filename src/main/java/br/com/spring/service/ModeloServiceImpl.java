package br.com.spring.service;

import br.com.spring.dao.SimpleUserRepository;
import br.com.spring.modelo.Modelo;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class ModeloServiceImpl implements ModeloService{

	private static final Log log = LogFactoryUtil.getLog(ModeloServiceImpl.class);

	
	@Autowired
	@Qualifier("simpleUserRepository")
	private SimpleUserRepository userRepository;
	
	@Transactional
	public void salva(Modelo modelo){
		userRepository.save(modelo);
	}

	
	@Transactional(readOnly = true)
	public List<Modelo> listAll() {
		return userRepository.findAll();

	}
	
	public void deleteAll() {
		log.info("deleção incluir nome de usuario");
		userRepository.deleteAll();
	}
}
