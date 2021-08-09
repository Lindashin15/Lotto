package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResult {
		
	private List<Integer> result;
	
	public LottoResult() {
		result = new ArrayList<>();
	}
	
	// 테스트케이스를 위한 set
	public void setResult(List<Integer> result) {
		this.result = result;
	}

	public List<Integer> resultOfMatchCount(List<Integer> winnigLotto, List<Lotto> lottoSheet) { 				
		for (Lotto lotto : lottoSheet) {
			result.add(matchLottoWithWinnigLotto(winnigLotto, lotto));			
		}
		return result;
	}
	
	private int matchLottoWithWinnigLotto(List<Integer> winnigLotto, Lotto lotto) {
		int count = 0;
		for (int i = 0; i < winnigLotto.size(); i++) {
			for (int j = 0; j < lotto.getLotto().size(); j++) {
				if(winnigLotto.get(i)==lotto.getLotto().get(j)) {
					count++;
				}
				continue;
			}
		}
		return count;
	}
			
	public long calculatePrize() {
		long totPrize = 0;
		for (Integer prize : result) {
			totPrize += LottoPrize.receivePrize(prize);
		}
		return totPrize;
	}
	
	public Map<Integer, Integer> countWinningLottoResult() {
		Map<Integer, Integer> countwinningLottoMap = new HashMap<>();
		int count = 0;
		for (int i = 3; i <= 6 ; i++) {
			count = Collections.frequency(result, i);
			countwinningLottoMap.put(i, count);
		}
		return countwinningLottoMap;
	}
	
}
