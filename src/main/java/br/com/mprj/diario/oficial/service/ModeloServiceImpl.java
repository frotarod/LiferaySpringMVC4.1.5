package br.com.mprj.diario.oficial.service;

import br.com.mprj.diario.oficial.dao.JdbcCorporateEventDao;
import br.com.mprj.diario.oficial.modelo.Modelo;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class ModeloServiceImpl {

	private static final Log log = LogFactoryUtil.getLog(ModeloServiceImpl.class);

	@Autowired
	private JdbcCorporateEventDao jdbcCorporateEventDao;
	
	@Transactional
	public void exibe(Modelo modelo){
		jdbcCorporateEventDao.persist(modelo);
	}
	
	@Transactional(readOnly = true)
	public List<Modelo> listAll() {
		return jdbcCorporateEventDao.findAll();

	}
}
