package org.security.resource;

import java.util.List;

import org.security.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@GetMapping("/")
	public String defaultMessage() {
		return "this application is protected under <b>spring boot security</b>";
	}

	@GetMapping("/user")
	public String getUserInfo() {
		return "USER_page_LOAD";
	}

	@GetMapping("/admin")
	public String admin() {
		return "ADMIN_PAGE_LOAD";
	}

	@GetMapping("/common")
	public String commonController() {
		return "COMMON_PAGE_LOAD";
	}
	
 
	  

}
