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

	private Task entity2model(io.nagaita.workman.dbflute.exentity.Task e) {
		// @formatter:off
		return Task.builder()
				.id(e.getId())
				.title(e.getTitle())
				.deadline(e.getDeadline())
				.scheduled(e.getScheduled())
				.build();
		// @formatter:on
	}

	private io.nagaita.workman.dbflute.exentity.Task model2entity(Task m) {
		val entity = new io.nagaita.workman.dbflute.exentity.Task();
		entity.setId(m.getId());
		entity.setTitle(m.getTitle());
		entity.setDeadline(m.getDeadline());
		entity.setScheduled(m.getScheduled());
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
