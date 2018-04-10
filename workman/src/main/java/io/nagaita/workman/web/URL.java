package io.nagaita.workman.web;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum URL {

	TASK("/tasks", "task/task"),
	TASK_STATUS("/task-status", "task/task-status");

	private String url;
	private String template;

}
