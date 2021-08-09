package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InputTest {
	
	Input input = new Input();
		
	@DisplayName("유효성체크")
	@ParameterizedTest
	@CsvSource(value = {"350, 0","4000, 4"})
	void checkVaild(int amount, int ouput) {
		// given

		// when
		int check = input.checkVaild(amount);
		// then
		assertThat(check).isEqualTo(ouput);
	}
	
	@Test
	void checkInputwinningNumbers() {
		// given

		// when
		List<Integer> winningNoList = input.checkInputwinningNumbers("2,7,13,36,46,23");
		// then		
		assertThat(winningNoList.size()).isEqualTo(6);
	}
	
	@DisplayName("BonusNumber유효성체크")
	@ParameterizedTest
	@CsvSource(value = {"45,45","44,44","46,46"})
	void checkInputBonusNumber(int bonusNum, int output) {
		// given

		// when
		int result = input.checkInputBonusNumber(bonusNum);
		// then
		assertThat(result).isEqualTo(output);
	}
	

	
}
