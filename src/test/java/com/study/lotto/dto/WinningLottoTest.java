package com.study.lotto.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class WinningLottoTest {

	@Test
	void createWinnigLotto() {
		// given
		List<Integer> winningNoList = new ArrayList<>();
		winningNoList.add(4);
		winningNoList.add(35);
		winningNoList.add(42);
		winningNoList.add(22);
		winningNoList.add(14);
		winningNoList.add(6);
		// when
		List<Integer> winningLotto = WinningLotto.createWinnigLotto(winningNoList, 8);
		// then
		assertThat(winningLotto.size()).isEqualTo(7);
	}

}
