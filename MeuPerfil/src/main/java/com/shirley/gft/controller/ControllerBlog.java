package com.shirley.gft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerBlog {
	
	
		@RequestMapping("/index")
		public String index() {
			return "Index";
		}
		
		@RequestMapping("/skills")
		public String skill() {
			return "Skills";
		}
		
		@RequestMapping("/projetos")
		public String projeto() {
			return "Projetos";
		}
		
		@RequestMapping("/contatos")
		public String contato() {
			return "Contatos";
		}
		
}

