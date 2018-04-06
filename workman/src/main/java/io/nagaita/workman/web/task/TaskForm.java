package io.nagaita.workman.web.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskForm {

	private Long id;
	private String title;
	private LocalDateTime deadline;
	private LocalDateTime scheduled;

}
