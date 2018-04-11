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
				//.deadline(LocalDateTimeform.getDeadline())
				//.scheduled(form.getScheduled())
				.build();
		// @formatter:on
	}
}
