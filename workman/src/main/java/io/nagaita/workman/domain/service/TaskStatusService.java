package io.nagaita.workman.domain.service;

import io.nagaita.workman.domain.model.TaskStatus;

import java.util.List;

public interface TaskStatusService {

	void add(TaskStatus status);

	List<TaskStatus> getAll();

}
