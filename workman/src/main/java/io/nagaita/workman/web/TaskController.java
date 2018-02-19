package io.nagaita.workman.web;

import io.nagaita.workman.domain.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskController {

	private TaskService taskService;

	@GetMapping("/")
	public String get(Model model) {
		model.addAttribute("tasks", taskService.getAll());
		return "task";
	}
}
