package io.nagaita.workman.domain.repository;

import io.nagaita.workman.domain.model.Task;

import java.util.List;

public interface TaskRepository {

	List<Task> get();

	void add(Task task);

}
