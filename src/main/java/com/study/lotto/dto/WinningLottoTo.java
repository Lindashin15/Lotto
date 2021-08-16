package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.List;

public class WinningLottoTo {
	
	List<Integer> winningLotto;
	
	public WinningLottoTo(List<Integer> winningLotto) {
		this.winningLotto = winningLotto;
	}

	public WinningLottoTo(List<Integer> winningNoList, int bonusNo) {
		this.winningLotto = createWinnigLotto(winningNoList, bonusNo);
	}
	
	private List<Integer> createWinnigLotto(List<Integer> winningNoList, int bonusNo) {
		winningLotto = new ArrayList<>();
		for (int i = 0; i < winningNoList.size(); i++) {
			winningLotto.add(winningNoList.get(i));
		}
		winningLotto.add(bonusNo);
		return winningLotto;
	}

	public List<Integer> getWinningLotto() {
		return winningLotto;
	}

}
