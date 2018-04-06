package io.nagaita.workman.domain.repository;

import io.nagaita.workman.domain.model.TaskStatus;

import java.util.List;

public interface TaskStatusRepository {

	List<TaskStatus> get();

	void add(TaskStatus task);

}
