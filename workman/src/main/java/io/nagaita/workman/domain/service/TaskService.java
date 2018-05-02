package io.nagaita.workman.domain.service;

import io.nagaita.workman.domain.model.Task;

import java.util.List;
import java.util.Map;

public interface TaskService {

	void add(Task task);

	List<Task> getAll();

	Task get(Long id);

	Map<String, String> selectAllStatusAsMap();

	void update(Task task);
}
