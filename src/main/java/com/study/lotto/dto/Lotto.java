package com.study.lotto.dto;

import java.util.List;

public class Lotto {
	
	List<Integer> lotto;
	
	public Lotto(LottoBehavior lottoBehavior) {
		lotto = lottoBehavior.createLotto();
	}
	
	public List<Integer> getLotto() {
		return lotto;
	}
	
}
