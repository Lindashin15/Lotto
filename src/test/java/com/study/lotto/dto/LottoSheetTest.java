package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LottoSheetTest {
	
	@DisplayName("로또한장구매")
	@ParameterizedTest
	@CsvSource(value = {"5,5","7,7"})
	void createLottoSheet(int no) {
		// given

		// when
		List<Lotto> lottoSheetNo = LottoSheet.createLottoSheet(no);
		// then
		assertThat(lottoSheetNo.size()).isEqualTo(no);
	}

}
