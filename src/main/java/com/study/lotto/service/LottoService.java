package com.study.lotto.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.study.lotto.dto.Lotto;
import com.study.lotto.dto.WinnigLotto;

public class LottoService {
	
	private Lotto lotto;
	private WinnigLotto winLotto;
	
	public List<List<Integer>> getLottoList(int amount){
		lotto = new Lotto(amount);
		return lotto.createLotto();
	}
	
	// 구매후 로또 종이 받기

	
	
	public ArrayList<Integer> getWinningLotto(String winningNumbers, int bonusNum) {
		winLotto = new WinnigLotto(winningNumbers, bonusNum);
		return winLotto.createWinLotto();		
	}

	// 받은 당첨번호 리스트로 정리
	


	public ArrayList<Integer> getWinnigNumbers(List<List<Integer>> lottoList, ArrayList<Integer> winningNoList) {
		
		return winLotto.checkWinnigNumbers(lottoList, winningNoList);
	}
		
	// 구매 로또와 당첨번호 체크
	
	
	
	
	public int getLottoPrize() {
		return winLotto.checkWinnigNoAndPrize();
	}
	
	

	//로또 당첨 결과지
	
	

	
	
	
	
	
	
	
	
	
	
	
}
