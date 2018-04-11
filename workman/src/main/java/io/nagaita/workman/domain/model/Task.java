package io.nagaita.workman.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Task {

	private Long id;
	private String title;
	private LocalDateTime deadline;
	private LocalDateTime scheduled;
	private String status;

}
