/*
 * This file is part of liferay-spring-mvc-portlet.
 *
 * liferay-spring-mvc-portlet is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * liferay-spring-mvc-portlet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * liferay-spring-mvc-portlet. If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.mprj.diario.oficial.controller;

import br.com.mprj.diario.oficial.dao.SimpleUserRepository;
import br.com.mprj.diario.oficial.dto.ModeloDTO;
import br.com.mprj.diario.oficial.modelo.Modelo;
import br.com.mprj.diario.oficial.service.ModeloServiceImpl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Handles requests for the view mode.
 */
@Controller
@RequestMapping("VIEW")
public class HomeController {

	private static final Log log = LogFactoryUtil.getLog(HomeController.class);

/*	@Autowired
	private ModeloServiceImpl modeloService; 
*/	
	/*@Autowired
	private SimpleUserRepository modeloService; */

	
	@Autowired
	private SimpleUserRepository modeloService; 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RenderMapping
	public String home(Locale locale, Model model) {

		log.info("Welcome home! the client locale is "+ locale.toString());

		model.addAttribute("modeloDTO", new ModeloDTO());
		return "home";
	}	
	

	 @ActionMapping(params = "action=salvarComunicacaoCaso")
	  public void salvarComunicacao(@ModelAttribute("modeloDTO") ModeloDTO modeloDTO,
	            ActionRequest actionRequest, ActionResponse actionResponse,
	            Model model) throws IOException {
		
	        log.info("#############Calling getCustomerData##########");
	        modeloService.save(new Modelo(147822, "novo"));
	        System.out.println(modeloDTO.getNome());
	    }	
	

}
