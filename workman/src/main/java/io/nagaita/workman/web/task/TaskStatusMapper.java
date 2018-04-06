package io.nagaita.workman.web.task;

import io.nagaita.workman.domain.model.TaskStatus;
import org.springframework.stereotype.Component;

@Component
public class TaskStatusMapper {

	public TaskStatus toModel(TaskStatusForm form) {
		// @formatter:off
		return TaskStatus.builder()
				.code(form.getCode())
				.name(form.getName())
				.description(form.getDescription())
				.displayOrder(form.getDisplayOrder())
				.build();
		// @formatter:on
	}

}
