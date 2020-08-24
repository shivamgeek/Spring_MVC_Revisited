package com.shivam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("search-page")
	public String showSearchPage() {
		return "search-page";
	}
	
	@RequestMapping("get-results")
	public String getResults(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		username = "Hey "+username.toUpperCase()+"!, greeting for doing so much Hard Work !!!";
		model.addAttribute("results",username);
		return "get-results";
	}
	
	
	
}
