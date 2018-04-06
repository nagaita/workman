package io.nagaita.workman.domain.repository;

import io.nagaita.workman.dbflute.exbhv.TaskBhv;
import io.nagaita.workman.domain.model.Task;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DBFluteTaskRepository implements TaskRepository {

	private TaskBhv taskBhv;

	private Task entity2model(io.nagaita.workman.dbflute.exentity.Task entity) {
		// @formatter:off
		return Task.builder()
				.id(entity.getId())
				.title(entity.getTitle())
				.deadline(entity.getDeadline())
				.scheduled(entity.getScheduled())
				.build();
		// @formatter:on
	}

	private io.nagaita.workman.dbflute.exentity.Task model2entity(Task model) {
		val entity = new io.nagaita.workman.dbflute.exentity.Task();
		entity.setId(model.getId());
		entity.setTitle(model.getTitle());
		entity.setDeadline(model.getDeadline());
		entity.setScheduled(model.getScheduled());
		return entity;
	}

	@Override
	public List<Task> get() {
		val entities = taskBhv.selectList(cb -> {
		});
		return entities.stream().map(this::entity2model).collect(Collectors.toList());
	}

	@Override
	public void add(Task task) {
		taskBhv.insert(model2entity(task));
	}

}
