package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoSheet {
	
	private List<Lotto> lottoList;
		
	public LottoSheet(int no, LottoBehavior lottoBehavior) {
		createLottoSheet(no, lottoBehavior);
	}

	public LottoSheet(List<Lotto> lottoList) {
		this.lottoList = lottoList;
	}

	private LottoSheet createLottoSheet(int no, LottoBehavior lottoBehavior) {				
		lottoList = new ArrayList<>();
		
		for (int i = 0; i < no; i++) {
			Lotto lotto = new Lotto(lottoBehavior);
			lottoList.add(lotto);
		}
		return new LottoSheet(lottoList);
	}

	public List<Lotto> getLottoList() {
		return lottoList;
	}
	
}
