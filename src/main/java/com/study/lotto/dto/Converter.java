package com.study.lotto.dto;

import org.springframework.stereotype.Component;

@Component
public class Converter {
	
	public LottoSheetTo convertToLottoSheetTo(LottoSheet lottoSheet) {
		return new LottoSheetTo(lottoSheet.getLottoList());
	}
	
	public WinningLottoTo convertToWinningLottoTo(WinningLotto winningLotto) {
		return new WinningLottoTo(winningLotto.getWinningLotto());
	}
	
	public LottoResultTo convertToLottoResultTo(LottoResult lottoResult) {
		return new LottoResultTo(lottoResult.getCountwinningLottoMap(), lottoResult.getTotPrize());
	}
		
}
