package io.nagaita.workman.domain.service;

import io.nagaita.workman.dbflute.exbhv.TaskBhv;
import io.nagaita.workman.domain.model.Task;
import lombok.AllArgsConstructor;
import lombok.val;
import org.dbflute.hook.AccessContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TaskServiceImpl implements TaskService {

	private TaskBhv taskBhv;

	private void insert() {
		val task = new io.nagaita.workman.dbflute.exentity.Task();
		task.setId(new Random().nextLong());
		task.setTitle("hoge");

		val ctx = new AccessContext();
		ctx.setAccessLocalDateTime(LocalDateTime.now());
		ctx.setAccessUser("auser");
		ctx.setAccessProcess("aproc");
		AccessContext.setAccessContextOnThread(ctx);

		taskBhv.insert(task);
	}

	@Override
	public List<Task> getAll() {
		insert(); // TODO just now
		val taskEntities = taskBhv.selectList(cb -> {
		});

		return taskEntities.stream().map(e -> Task.builder().id(e.getId()).title(e.getTitle()).deadline(e.getDeadline())
				.scheduled(e.getScheduled()).build()).collect(Collectors.toList());
	}

}
