package com.study.lotto.dto;

import java.util.Collections;
import java.util.List;

public class WinningLotto {
	
	List<Integer> winningLotto;

	public WinningLotto(List<Integer> winningLotto) {
		this.winningLotto = createWinnigLotto(winningLotto);
	}

	public List<Integer> createWinnigLotto(List<Integer> winningLotto) {
		Collections.sort(winningLotto);
		return winningLotto;
	}

	public List<Integer> getWinningLotto() {
		return winningLotto;
	}	
		
}
