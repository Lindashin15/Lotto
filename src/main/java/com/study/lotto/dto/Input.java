package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.study.lotto.exception.InvaildLottoNumberException;

public class Input {
	
	List<Integer> winningNoList;
	Output output;
	
	public Input() {
		winningNoList = new ArrayList<>();
		output = new Output();
	}
	
	public int checkVaild(int amount) {
		int vaildate = amount/1000;
		if(!(amount%1000==0)) vaildate = 0;		
		return vaildate;
	}
	
	public List<Integer> checkInputwinningNumbers(String winningNumbers) {
		String[] winningArray = winningNumbers.split(",");
		checkWinningNumSize(winningArray);
		createWinningLottoList(winningArray);
		checkVaildLottoNo();
		checkDuplicateWinningNoList();
		return winningNoList;
	}
	
	public void checkWinningNumSize(String[] winningArray) {
		if(!(winningArray.length == 6)) output.printUnvaildationLottoLength();
	}
	
	public void createWinningLottoList(String[] winningArray) {
		for (int i = 0; i < winningArray.length; i++) {
			winningNoList.add(Integer.parseInt(winningArray[i]));
		}		
	}
	
	public void checkVaildLottoNo() {
		for (int i = 0; i < winningNoList.size(); i++) {
			if(!(winningNoList.get(i)>=1 && winningNoList.get(i)<=45)) 
				output.printUnvaildationNumber();
		}
	}
	
	public void checkDuplicateWinningNoList() {
		if(winningNoList.size() != winningNoList.stream().distinct().count()) output.printDuplicationNum();		
	}
	
	public int checkInputBonusNumber(int bonusNum) {
		if(!(bonusNum>=1 && bonusNum<=45)) output.printUnvaildationNumber();
		checkDuplicateWithWinningNoList(bonusNum);
		return bonusNum;
	}
	
	public void checkDuplicateWithWinningNoList(int bonusNum) {
		for (int i = 0; i < winningNoList.size(); i++) {
			if(winningNoList.get(i) == bonusNum) output.printDuplicationNum();
		}
	}
	
	public void InvaildLottoNumberException() {
		new InvaildLottoNumberException();
	}
		
}
