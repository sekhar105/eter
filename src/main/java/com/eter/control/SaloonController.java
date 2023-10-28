package com.eter.control;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eter.dto.SaloonReq;
import com.eter.entites.Saloon;

@Controller
@RequestMapping("/salooncontroller")
public class SaloonController {
//	@GetMapping("/addSaloon")
//	public String getSaloonForm(Model model) {
//		model.addAttribute("saloon",new Saloon());
//		
//		return "addSaloon";
//	}
		
	
	@GetMapping("/addSaloon")
	public String getAllSaloons(Model model) {
		model.addAttribute("saloon",new SaloonReq());
		return"addSaloon";
	}
	@RequestMapping(value = "/savesaloon", method = RequestMethod.POST, 
	consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public String saveSaloon(@ModelAttribute("saloon") SaloonReq saloonReq) {
		System.out.println(saloonReq);
		return "allSalons";
	}
//	@RequestMapping(value = "/getAllSaloons" ,method = RequestMethod.GET)
	@GetMapping("/getAllSaloons")
	public String getSaloon() {
		return "allSalons";
	}
}
