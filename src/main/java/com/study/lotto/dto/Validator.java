package com.study.lotto.dto;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Validator {
	
	@Autowired
	Output output;
	
	public Validator() {
		output = new Output();
	}
	
	public void checkValidAmount(int amount) {
		if(!(amount%1000==0)) output.UnvalidateAmount();
		output.printValidateAmount(amount/1000);
	}
	
	public void checkValidWinningNoList(List<Integer> winningNoList) {
		checkValidWinningNoSize(winningNoList);
		checkValidWinningNo(winningNoList);
		checkDuplicateWinningNoList(winningNoList);
	}
	
	public void checkValidWinningNoSize(List<Integer> winningNoList) {
		if(!(winningNoList.size() == 6)) output.printUnvalidationLottoLength();
	}
	
	public void checkValidWinningNo(List<Integer> winningNoList) {
		for (int i = 0; i < winningNoList.size(); i++) {
			if(!(winningNoList.get(i)>=1 && winningNoList.get(i)<=45)) output.printUnvalidationNumber();
		}
	}
	
	public void checkDuplicateWinningNoList(List<Integer> winningNoList) {
		if(winningNoList.size() != winningNoList.stream().distinct().count()) output.printDuplicationNum();
	}
	
	public void checkValidBonusNo(int bonusNo,List<Integer> winningNoList) {
		checkValidBonusNo(bonusNo);
		checkDuplicateBonusNo(bonusNo, winningNoList);
	}
	
	public void checkValidBonusNo(int bonusNo) {
		if(!(bonusNo>=1 && bonusNo<=45)) output.printUnvalidationNumber();
	}
	
	public void checkDuplicateBonusNo(int bonusNo,List<Integer> winningNoList) {
		for (int i = 0; i < winningNoList.size(); i++) {
			if(winningNoList.get(i) == bonusNo) output.printDuplicationNum();
		}
	}
	
}
