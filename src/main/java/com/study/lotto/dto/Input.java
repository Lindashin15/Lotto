package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Input {
	
	@Autowired
	Validator validator;
	Scanner scanner;
	List<Integer> winningNoList;
	int bonusNo;
	
	public Input() {
		//validator = new Validator();
		scanner = new Scanner(System.in);
	}
	
	public int inputAmount() {
		int amount = scanner.nextInt();
		validator.checkValidAmount(amount);
		int validNo = amount/1000;
		return validNo;
	}
		
	public void inputWinningNoList() {
		String winningNumbers = scanner.next();
		String[] winningArray = winningNumbers.split(",");
		List<Integer> winningNoList = createWinningNoList(winningArray);
		validator.checkValidWinningNoList(winningNoList);		
	}
	
	public List<Integer> createWinningNoList(String[] winningArray) {
		winningNoList = new ArrayList<>();
		for (int i = 0; i < winningArray.length; i++) {
			winningNoList.add(Integer.parseInt(winningArray[i]));
		}
		return winningNoList;
	}
	
	public void inputBonusNo() {
		bonusNo = scanner.nextInt();
		validator.checkValidBonusNo(bonusNo, winningNoList);	
	}
	
	public WinningLottoTo givenWinningLotto() {
		return new WinningLottoTo(winningNoList, bonusNo);
	}	

}
