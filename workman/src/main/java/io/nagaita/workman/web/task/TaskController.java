package io.nagaita.workman.web.task;

import io.nagaita.workman.domain.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskController {

	private TaskService taskService;
	private TaskMapper taskMapper;

	@ModelAttribute
	public TaskForm initForm() {
		return new TaskForm();
	}

	@GetMapping("")
	public String get(Model model) {
		model.addAttribute("tasks", taskService.getAll());
		return "task/list";
	}

	@PostMapping("")
	public String post(TaskForm form, BindingResult result) {
		if (!result.hasErrors()) {
			val model = taskMapper.toModel(form);
			model.setStatus("TODO"); // default
			taskService.add(model);
		}
		return "redirect:/tasks";
	}
}
