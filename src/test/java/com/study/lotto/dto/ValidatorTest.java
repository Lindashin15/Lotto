package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatorTest {
	
	Validator validator = new Validator();	
	
	@DisplayName("테스트이름")
	@ParameterizedTest
	@CsvSource(value = {"4","5000","2300"})
	void checkValidAmount(int amount) {
		// given
		// when
		validator.checkValidAmount(amount);	
		// then
	}	
	
	@Test
	void checkValidWinningNoList() {
		// given
		List<Integer> noList = new ArrayList<>();
		noList.add(35);
		noList.add(45);
		noList.add(5);
		// when
		validator.checkValidWinningNoList(noList);
		// then
	}

}



