package com.study.lotto.dto;

import java.util.Map;

public class LottoResultTo {
	
	private Map<Integer, Integer> countwinningLottoMap;
	private long totPrize;
		
	public LottoResultTo(Map<Integer, Integer> countwinningLottoMap, long totPrize) {
		this.countwinningLottoMap = countwinningLottoMap;
		this.totPrize = totPrize;
	}

	public Map<Integer, Integer> getCountwinningLottoMap() {
		return countwinningLottoMap;
	}

	public long getTotPrize() {
		return totPrize;
	}
	
}
