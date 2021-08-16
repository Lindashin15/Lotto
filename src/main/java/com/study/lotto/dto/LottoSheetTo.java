package com.study.lotto.dto;

import java.util.List;

public class LottoSheetTo {

	private List<Lotto> lottoList;

	public LottoSheetTo(List<Lotto> lottoList) {
		this.lottoList = lottoList;
	}

	public List<Lotto> getLottoList() {
		return lottoList;
	}
	
}
