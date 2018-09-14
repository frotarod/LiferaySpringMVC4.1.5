package br.com.mprj.diario.oficial.dao;

import br.com.mprj.diario.oficial.modelo.Modelo;
import br.com.mprj.diario.oficial.service.ModeloServiceImpl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class JdbcCorporateEventDao  {

	private static final Log log = LogFactoryUtil.getLog(ModeloServiceImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	public void persist(Modelo product) {
		em.persist(product);
	}
	
	public List<Modelo> findAll() {
		return em.createQuery("SELECT p FROM Modelo p").getResultList();
	}
	
	
}
