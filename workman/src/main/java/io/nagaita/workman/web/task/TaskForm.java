package io.nagaita.workman.web.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskForm {

	private Long id;
	private String title;
	private String status;
	private String deadlineDate;
	private String deadlineTime;
	private String scheduledDate;
	private String scheduledTime;

}
