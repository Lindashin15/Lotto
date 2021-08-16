package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class WinningLottoTest {

	@Test
	void test() {
		// given
		List<Integer> winList = new ArrayList<>();
		winList.add(34);
		winList.add(2);
		winList.add(15);
		winList.add(22);
		winList.add(6);
		List<Integer> result = new ArrayList<>();
		result.add(2);
		result.add(6);
		result.add(15);
		result.add(22);
		result.add(34);
		// when
		WinningLotto winningLotto = new WinningLotto(winList);
		// then
		assertThat(winningLotto.getWinningLotto()).containsAll(result);
	}
}
