package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LottoSheetTest {
	

	@Test
	void test() {
		// given			
		LottoSheet lottoSheet = new LottoSheet(3, new TestLottoBehavior());
		// then
		assertThat(lottoSheet.getLottoList().size()).isEqualTo(3);
	}	
}

class TestLottoBehavior implements LottoBehavior{
	@Override
	public List<Integer> createLotto() {
		return Arrays.asList(1,2,3,4,5,6);
	}
	
}
