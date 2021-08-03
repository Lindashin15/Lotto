package com.study.lotto.dto;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrintTest {

	private Print print;
	
	@BeforeEach
	void setup() {
		print = new Print();
	}

	

	@DisplayName("소문자를 입력받으면 대문자를 리턴한다.")
	@ParameterizedTest
	@CsvSource(value = {
			"aaaa, AAAA",
			"bbbb, BBb"})
	void toUpperCase(String input, String ouput) {
		// given
		
		// when
		String upper = print.toUpperCase(input);
		
		// then
		assertThat(upper).isEqualTo(ouput);
	}
	

	
	@Test
	void test1() {
		// given
		
		// when
		//로또 6개, 당첨번호 6개 -> 몇등?
		
		//long amount = a.reuslt(로또 6개, 당첨번호 6개);
		
		// then
		//amount.?
	}
}
