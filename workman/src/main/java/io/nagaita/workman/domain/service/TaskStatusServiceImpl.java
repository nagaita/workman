package io.nagaita.workman.domain.service;

import io.nagaita.workman.domain.model.TaskStatus;
import io.nagaita.workman.domain.repository.TaskStatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskStatusServiceImpl implements TaskStatusService {

	private TaskStatusRepository taskStatusRepository;

	@Override
	@Transactional
	public List<TaskStatus> getAll() {
		return taskStatusRepository.get();
	}

	@Override
	@Transactional
	public void add(TaskStatus status) {
		taskStatusRepository.add(status);
	}

}
