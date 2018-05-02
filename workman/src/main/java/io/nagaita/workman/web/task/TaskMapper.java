package io.nagaita.workman.web.task;

import io.nagaita.workman.domain.model.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

	public Task toModel(TaskForm form) {
		// @formatter:off
		return Task.builder()
				.id(form.getId())
				.title(form.getTitle())
				.status(form.getStatus())
				//.deadline(LocalDateTimeform.getDeadline())
				//.scheduled(form.getScheduled())
				.build();
		// @formatter:on
	}

	public TaskForm toForm(Task model) {
		// @formatter:off
		return TaskForm.builder()
				.id(model.getId())
				.title(model.getTitle())
				.status(model.getStatus())
				.build();
		// @formatter:on
	}
}
