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
package br.com.spring.controller;

import br.com.spring.dto.ModeloDTO;
import br.com.spring.modelo.Modelo;
import br.com.spring.service.ModeloService;

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

	@Autowired
	private ModeloService modeloService; 
	
	@RenderMapping
	public String home(Locale locale, Model model) {

		log.info("Welcome home! the client locale is "+ locale.toString());

		model.addAttribute("modeloDTO", new ModeloDTO());
		return "home";
	}	
	

	 @ActionMapping(params = "action=salvarForm")
	  public void salvarComunicacao(@ModelAttribute("modeloDTO") ModeloDTO modeloDTO,
	            ActionRequest actionRequest, ActionResponse actionResponse,
	            Model model) throws IOException {
		 
		 	modeloService.deleteAll();
	        
		 	modeloService.salva(modeloDTO.convertoTOModel(modeloDTO));
	      
	        for (Modelo modelo : modeloService.listAll()) {
				System.out.println(modelo.getNome());
			}

	 }	
	

}
