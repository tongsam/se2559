package com.roo.team19.web;


import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sama")
@Controller
public class TestController {
	@RequestMapping(value = "/test", produces = "text/html")
	public String viewTest(Model uiModel) {

		return "sama/test";
}
}