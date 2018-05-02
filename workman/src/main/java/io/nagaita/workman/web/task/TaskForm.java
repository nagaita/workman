package io.nagaita.workman.web.task;

import lombok.Data;

@Data
public class TaskForm {

	private Long id;
	private String title;
	private String deadlineDate;
	private String deadlineTime;
	private String scheduledDate;
	private String scheduledTime;

}
