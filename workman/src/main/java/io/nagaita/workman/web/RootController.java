package io.nagaita.workman.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/root")
public class RootController {

	@GetMapping("/")
	public String get() {
		return "root";
	}
}
