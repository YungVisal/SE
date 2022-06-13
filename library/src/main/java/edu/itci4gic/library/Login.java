package edu.itci4gic.library;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Login {
	@GetMapping("/")
	public String index() {
		return "login";
	}
	@GetMapping("/home")
	public String index1() {
		return "homepage";
	}

}