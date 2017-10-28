package org.mbtlab.hudson.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class myController {
	private final Log logger = LogFactory.getLog(myController.class);
	
	@RequestMapping(value = {"/"},method = {RequestMethod.HEAD})
	public String head(){
		return "index.jsp";
	}
	
	@RequestMapping(value = {"/index","/"},method = {RequestMethod.GET})
	public String index(Model model) throws Exception{
		logger.info("spring mvc start");
		if(model != null)model.addAttribute("test", "hello mbtlab");
		model.addAttribute("a","test");
		return "index.jsp";
	}
}
