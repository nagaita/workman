package io.nagaita.workman.web.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskStatusForm {

	private String code;
	private String name;
	private String description;
	private int displayOrder;

}
