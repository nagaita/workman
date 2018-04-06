package io.nagaita.workman.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskStatus {

	private String code;
	private String name;
	private String description;
	private int displayOrder;

}
