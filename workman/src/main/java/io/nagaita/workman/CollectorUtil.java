package io.nagaita.workman;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CollectorUtil {

	public static <T, K, U> Collector<T, ?, Map<K, U>> toLinkedHashMap(Function<? super T, ? extends K> keyMapper,
			Function<? super T, ? extends U> valueMapper) {
		return Collectors.toMap(keyMapper, valueMapper, collisionResolver(), LinkedHashMap::new);
	}

	private static <U> BinaryOperator<U> collisionResolver() {
		return (k1, k2) -> {
			throw new IllegalStateException(String.format("Duplicate key %s, %s.", k1, k2));
		};
	}

}
