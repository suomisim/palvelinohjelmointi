package painoOhjelma.v1.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import painoOhjelma.v1.bean.*;
import painoOhjelma.v1.dao.*;


@Controller
@RequestMapping (value="/painot")
public class PainoController {
	
	SimpleDateFormat formatoija = new SimpleDateFormat("dd.MM.yyyy");
	Date nykyhetki = new Date();
	String muotoiltuAika = formatoija.format(nykyhetki); 

	@Inject
	private PainoDAO dao;
	
	public PainoDAO getDao() {
		return dao;
	}

	public void setDao(PainoDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="uusi", method=RequestMethod.GET)
	public String getCreateForm(Model model) {
  
		Paino tyhjaPaino = new PainoImpl();
		tyhjaPaino.setPvm(muotoiltuAika);
		
		model.addAttribute("paino", tyhjaPaino);
		return "henk/createForm";
	}

	@RequestMapping(value="uusi", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="paino") @Valid PainoImpl paino, BindingResult result, String action, Model model, String pvm) {
	
		if (action.equals("show") && (result.hasErrors())) {
			List<Paino> painot = dao.haeTietty(pvm);
				model.addAttribute("painot", painot);
				return "henk/viewAll";
		} else if (result.hasErrors()) {
				return "henk/createForm";
		} else {
			dao.talleta(paino);
			return "henk/view";
		}
	
	}
	@RequestMapping(value="lista", method=RequestMethod.GET)
	public String listAll(Model model) {
		List<Paino> painot = dao.haeKaikki();
		model.addAttribute("painot", painot);
		return "henk/viewAll";
	}

}