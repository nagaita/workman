package io.nagaita.workman.domain.service;

import io.nagaita.workman.domain.model.Task;

import java.util.List;

public interface TaskService {

	void add(Task task);

	List<Task> getAll();

}
