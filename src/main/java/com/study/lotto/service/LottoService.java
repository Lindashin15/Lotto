package com.study.lotto.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.study.lotto.dto.Lotto;
import com.study.lotto.dto.LottoResult;
import com.study.lotto.dto.LottoSheet;
import com.study.lotto.dto.WinningLotto;

public class LottoService {

	LottoResult lottoResult = new LottoResult();
		
	public List<Lotto> createLotto(int vaildNo) {
		return LottoSheet.createLottoSheet(vaildNo);
	}
	
	public List<Integer> createWinningLotto(List<Integer> winningNoList, int bonusNum) {
		return WinningLotto.createWinnigLotto(winningNoList, bonusNum);
	}
	
	public long matchLottoWithWinningLotto(List<Integer> winnigLotto, List<Lotto> lottoSheet) {
		lottoResult.resultOfMatchCount(winnigLotto, lottoSheet);
		return receiveTotPrize();
	}
	
	public long receiveTotPrize() {
		return lottoResult.calculatePrize();
	}
	
	public Map<Integer, Integer> countWinningLottoResult(){
		return lottoResult.countWinningLottoResult();
	}

}
