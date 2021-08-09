package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LottoResultTest {
	
	@Test
	void calculatePrize() {
		// given
		List<Integer> result = new ArrayList<>();
		result.add(2);
		result.add(1);
		result.add(3);
		result.add(4);
		result.add(3);
		result.add(7);
		result.add(6);
		result.add(5);
		
		// when
		LottoResult lottoResult = new LottoResult();
		lottoResult.setResult(result);
		long totPrize = lottoResult.calculatePrize();		
		// then
		assertThat(totPrize).isEqualTo(2031600000);
	}
	
	@DisplayName("당첨갯수Map에 넣기")
	@ParameterizedTest
	@CsvSource(value = {"3,2","4,3","5,1","6,1"})
	void countResult(int key, int value) {
		// given
		List<Integer> result = new ArrayList<>();
		result.add(2);
		result.add(1);
		result.add(3);
		result.add(4);
		result.add(3);
		result.add(7);
		result.add(4);
		result.add(6);
		result.add(5);
		result.add(4);
		result.add(0);
		// when
		LottoResult lottoResult = new LottoResult();
		lottoResult.setResult(result);
		Map<Integer, Integer> countMap = lottoResult.countWinningLottoResult();
		// then
		assertThat(countMap.get(key)).isEqualTo(value);
	}

	
}
