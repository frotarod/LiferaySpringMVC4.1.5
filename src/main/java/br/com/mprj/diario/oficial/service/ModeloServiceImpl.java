package br.com.mprj.diario.oficial.service;

import br.com.mprj.diario.oficial.dao.SimpleUserRepository;
import br.com.mprj.diario.oficial.modelo.Modelo;

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
