package com.study.lotto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.lotto.dto.Converter;
import com.study.lotto.dto.LottoBehavior;
import com.study.lotto.dto.LottoResult;
import com.study.lotto.dto.LottoResultTo;
import com.study.lotto.dto.LottoSheet;
import com.study.lotto.dto.LottoSheetTo;
import com.study.lotto.dto.WinningLotto;
import com.study.lotto.dto.WinningLottoTo;

@Service
public class LottoService {
	
	@Autowired
	Converter converter;
	
	public LottoSheetTo createLotto(int no, LottoBehavior lottoBehavior) {
		return converter.convertToLottoSheetTo(new LottoSheet(no, lottoBehavior));
	}

	public WinningLottoTo createWinningLotto(List<Integer> winningLotto) {
		return converter.convertToWinningLottoTo(new WinningLotto(winningLotto));
	}
	
	public LottoResultTo createLottoResult(LottoSheetTo lottoSheet, WinningLottoTo winningLotto) {
		return converter.convertToLottoResultTo(new LottoResult(winningLotto.getWinningLotto(), lottoSheet.getLottoList()));
	}	

}
