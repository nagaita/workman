package io.nagaita.workman.domain.service;

import io.nagaita.workman.domain.model.Task;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

	@Override
	public List<Task> getAll() {
		return Arrays.asList(new Task("hoge"), new Task("aaa"), new Task("ccc"));
	}
}
