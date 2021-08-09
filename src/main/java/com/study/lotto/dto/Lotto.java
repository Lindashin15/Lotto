package com.study.lotto.dto;

import java.util.List;

public class Lotto {
	
	LottoBehavior lottoBehavior;
	List<Integer> lotto;
	
	public Lotto(LottoBehavior lottoBehavior) {
		this.lottoBehavior = lottoBehavior;
		lotto = lottoBehavior.createLotto();
	}

	public List<Integer> getLotto() {
		return lotto;
	}
	
}
