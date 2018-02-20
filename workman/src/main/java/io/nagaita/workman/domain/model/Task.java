package io.nagaita.workman.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@AllArgsConstructor
@Builder
public class Task {

	private Long id;
	private String title;
	private LocalDateTime deadline;
	private LocalDateTime scheduled;

}
