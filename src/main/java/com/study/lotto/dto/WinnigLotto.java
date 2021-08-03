package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WinnigLotto {
	
	private String winningNumbers;
	private int bonusNum;
	private ArrayList<Integer> winningNoList;
	private ArrayList<Integer> winningResult;
	private HashMap<Integer, Integer> winnigCountMap;
	private LottoPrize lottoPrize;
	


	
	
	public WinnigLotto(String winningNumbers, int bonusNum) {
		this.winningNumbers = winningNumbers;
		this.bonusNum = bonusNum;
		this.winningNoList = new ArrayList<>();
		this.winningResult = new ArrayList<>();
		this.winnigCountMap = new HashMap<>();
		this.lottoPrize = new LottoPrize();
	}

	public ArrayList<Integer> createWinLotto() {
		String[] winningArray = winningNumbers.split(",");
		for (int i = 0; i < winningArray.length; i++) {
			winningNoList.add(Integer.parseInt(winningArray[i]));
		}
		
		winningNoList.add(bonusNum);
		Collections.sort(winningNoList);
		return winningNoList;
	}
	
	public ArrayList<Integer> checkWinnigNumbers(List<List<Integer>> lottoList, ArrayList<Integer> winningNoList) {
		for (List<Integer> lotto : lottoList) {
			int count = countWinNumber(lotto);
			if(count>=3) {
				winningResult.add(count);				
			}			
		}
		Collections.sort(winningResult);
		return winningResult;
	}
	
	public int countWinNumber(List<Integer> lotto) {
		int count = 0;
		for (int i = 0; i < winningNoList.size(); i++) {
			for (int j = 0; j < lotto.size(); j++) {
				if(lotto.get(j) == winningNoList.get(i)) {
					count++;
				}
				continue;
			}				
		}
		return count;
	}
	
	private void countWinningNumber() {
		
		int count = 1;
		int lastInx = winningResult.size()-1;
		for (int i = 0; i < winningResult.size(); i++) {
			if(i != winningResult.size()-1) {
				if(winningResult.get(i) == winningResult.get(i+1)) {
					count++;
				}else {
					winnigCountMap.put(winningResult.get(i), count);
					count = 1;
				}
			}else {
				if(winningResult.get(lastInx) == winningResult.get(lastInx-1)){
					count++;
					winnigCountMap.put(winningResult.get(i), count);
				}else {
					winnigCountMap.put(winningResult.get(i), count);
				}		
			}
		}
		
	}
	
	public int checkWinnigNoAndPrize() {
		countWinningNumber();
		return lottoPrize.calculatePrize(winnigCountMap);
	}
	
	
	
}
