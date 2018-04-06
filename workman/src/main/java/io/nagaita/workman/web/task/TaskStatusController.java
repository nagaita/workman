package io.nagaita.workman.web.task;

import io.nagaita.workman.domain.service.TaskStatusService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task-statuses")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskStatusController {

	private TaskStatusService taskStatusService;
	private TaskStatusMapper taskStatusMapper;

	@ModelAttribute
	public TaskStatusForm initForm() {
		return new TaskStatusForm();
	}

	@GetMapping("")
	public String get(Model model) {
		model.addAttribute("statuses", taskStatusService.getAll());
		return "taskStatus";
	}

	@PostMapping("")
	public String post(TaskStatusForm form, BindingResult result) {
		if (!result.hasErrors()) {
			taskStatusService.add(taskStatusMapper.toModel(form));
		}
		return "redirect:/task-statuses";
	}
}
