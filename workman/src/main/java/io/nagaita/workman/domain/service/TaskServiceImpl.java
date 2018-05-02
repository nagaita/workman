package io.nagaita.workman.domain.service;

import io.nagaita.workman.domain.model.Task;
import io.nagaita.workman.domain.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;

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
	@Transactional
	public void add(Task task) {
		taskRepository.add(task);
	}

}
