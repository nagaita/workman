package io.nagaita.workman.domain.service;

import io.nagaita.workman.CollectorUtil;
import io.nagaita.workman.domain.model.Task;
import io.nagaita.workman.domain.model.TaskStatus;
import io.nagaita.workman.domain.repository.TaskRepository;
import io.nagaita.workman.domain.repository.TaskStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;
	private TaskStatusRepository taskStatusRepository;

	@Override
	@Transactional
	public List<Task> getAll() {
		return taskRepository.get();
	}

	@Override
	public Task get(Long id) {
		return taskRepository.get(id);
	}

	@Override
	public Map<String, String> selectAllStatusAsMap() {
		// use LinkedHashMap to keep display order
		// @formatter:off
		return taskStatusRepository.get().stream()
				.collect(CollectorUtil.toLinkedHashMap(TaskStatus::getCode, TaskStatus::getName));
		// @formatter:on
	}

	@Override
	@Transactional
	public void update(Task task) {
		taskRepository.update(task);
	}

	@Override
	@Transactional
	public void add(Task task) {
		taskRepository.add(task);
	}

}
