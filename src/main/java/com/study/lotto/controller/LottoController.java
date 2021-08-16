package com.study.lotto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.lotto.dto.AutomaticLottoBehavior;
import com.study.lotto.dto.Input;
import com.study.lotto.dto.LottoResultTo;
import com.study.lotto.dto.LottoSheetTo;
import com.study.lotto.dto.Output;
import com.study.lotto.dto.WinningLottoTo;
import com.study.lotto.service.LottoService;

@Controller
public class LottoController {
		
	@Autowired
 	private LottoService lottoService;
	@Autowired
	private Input input;
	@Autowired
	private Output output;
	
	public void run() {
		output.printOfIntroduce();
		
		int validNo = input.inputAmount();
		LottoSheetTo lottoSheetTo = lottoService.createLotto(validNo, new AutomaticLottoBehavior());
		output.printOfLottoSheet(lottoSheetTo);
		
		output.printWinnigNoList();
		input.inputWinningNoList();
		
		output.printBonusNo();
		input.inputBonusNo();
		
		WinningLottoTo winningLottoTO = input.givenWinningLotto();
		WinningLottoTo winningLotto = lottoService.createWinningLotto(winningLottoTO.getWinningLotto());
		
		LottoResultTo lottoResultTo = lottoService.createLottoResult(lottoSheetTo, winningLotto);
		output.printLottoResult(lottoResultTo);
	}
	
		
}
