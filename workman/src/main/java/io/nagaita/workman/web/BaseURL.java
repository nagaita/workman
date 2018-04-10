package io.nagaita.workman.web;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum BaseURL {
	// @formatter:off
	API_INTERNAL("API(内向き)", "/api/internal", false),
	API_EXTERNAL("API(外向き)", "/api/", false),
	SCREEN_ADMIN("管理画面" , "/admin", true),
	SCREEN_USER ("ユーザー画面", "", true);
	// @formatter:on

	private String label;
	private String baseUrl;
	private boolean protectedCsrf;

	public static BaseURL of(String currentUrl) {
		if (currentUrl == null) {
			return SCREEN_USER;
		}

		// @formatter:off
		return Arrays.stream(values())
				.filter(location -> currentUrl.startsWith(location.getBaseUrl()))
				.findFirst()
				.orElse(SCREEN_USER);
		// @formatter:on
	}
}
