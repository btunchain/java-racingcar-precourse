package com.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
	
	@Test
	@DisplayName("자동차 이동 체크 테스트")
	void checkCarMoveTest() {
		assertThat(new Car("car1").checkCarMove()).isTrue();
	}
	
}
