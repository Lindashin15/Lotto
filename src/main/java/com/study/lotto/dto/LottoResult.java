package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResult {
	
	private Map<Integer, Integer> countwinningLottoMap;
	private long totPrize;
		
	public LottoResult(Map<Integer, Integer> countwinningLottoMap, long totPrize) {
		this.countwinningLottoMap = countwinningLottoMap;
		this.totPrize = totPrize;
	}

	public LottoResult(List<Integer> winnigLotto, List<Lotto> lottoSheet) {
		createLottoResult(winnigLotto, lottoSheet);
	}
		
	public LottoResult createLottoResult(List<Integer> winnigLotto, List<Lotto> lottoSheet) {
		List<Integer> result = resultOfMatchCount(winnigLotto, lottoSheet);
		calculatePrize(result);
		countWinningLottoResult(result);
		return new LottoResult(countwinningLottoMap,totPrize);
	}
	
	private List<Integer> resultOfMatchCount(List<Integer> winnigLotto, List<Lotto> lottoSheet) { 				
		List<Integer> result = new ArrayList<>();
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
	
	private long calculatePrize(List<Integer> result) {
		for (Integer prize : result) {
			totPrize += LottoPrize.receivePrize(prize);
		}
		return totPrize;
	}
	
	private Map<Integer, Integer> countWinningLottoResult(List<Integer> result) {
		countwinningLottoMap = new HashMap<>();
		int count = 0;
		for (int i = 3; i <= 6 ; i++) {
			count = Collections.frequency(result, i);
			countwinningLottoMap.put(i, count);
		}
		return countwinningLottoMap;
	}

	public Map<Integer, Integer> getCountwinningLottoMap() {
		return countwinningLottoMap;
	}

	public long getTotPrize() {
		return totPrize;
	}
	
}
