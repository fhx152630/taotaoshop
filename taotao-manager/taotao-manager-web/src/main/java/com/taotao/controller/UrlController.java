package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlController {

	@RequestMapping("/")
	public String goIndex(){
		return "index";
	}
/*	@RequestMapping("/itemAdd")
	public String itemAdd(){
		return "item-add";
	}*/
	@RequestMapping("/{page}")
	public String goJsp(@PathVariable String page){
		return page;
	}
}
