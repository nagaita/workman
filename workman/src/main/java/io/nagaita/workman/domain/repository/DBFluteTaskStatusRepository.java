package io.nagaita.workman.domain.repository;

import io.nagaita.workman.dbflute.exbhv.TaskStatusBhv;
import io.nagaita.workman.domain.model.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DBFluteTaskStatusRepository implements TaskStatusRepository {

	private TaskStatusBhv taskStatusBhv;

	private TaskStatus entity2model(io.nagaita.workman.dbflute.exentity.TaskStatus entity) {
		// @formatter:off
		return TaskStatus.builder()
				.code(entity.getCode())
				.name(entity.getName())
				.description(entity.getDescription())
				.displayOrder(entity.getDisplayOrder())
				.build();
		// @formatter:on
	}

	private io.nagaita.workman.dbflute.exentity.TaskStatus model2entity(TaskStatus model) {
		val entity = new io.nagaita.workman.dbflute.exentity.TaskStatus();
		entity.setCode(model.getCode());
		entity.setName(model.getName());
		entity.setDescription(model.getDescription());
		entity.setDisplayOrder(model.getDisplayOrder());
		return entity;
	}

	@Override
	public List<TaskStatus> get() {
		val statusList = taskStatusBhv.selectList(cb -> {
			cb.query().addOrderBy_DisplayOrder_Asc();
		});

		return statusList.stream().map(this::entity2model).collect(Collectors.toList());
	}

	@Override
	public void add(TaskStatus task) {
		taskStatusBhv.insert(model2entity(task));
	}
}
