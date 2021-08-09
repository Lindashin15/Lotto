package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LottoPrizeTest {
		
	@DisplayName("상금받기")
	@ParameterizedTest
	@CsvSource(value = {"3,50000", "4,1500000","5,30000000","6,2000000000","1,0"})
	void receivePrize(int matchCount, long outpuut) {
		// given

		// when
		long prize = LottoPrize.receivePrize(matchCount);
		// then
		assertThat(prize).isEqualTo(outpuut);
	}
	
}
