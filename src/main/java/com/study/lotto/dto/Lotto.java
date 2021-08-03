package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
	
	private int amount;
	private List<List<Integer>> lottoList;
	
	
	
	public Lotto(int amount) {
		this.amount = amount;
		this.lottoList = new ArrayList<List<Integer>>();
	}


	public List<List<Integer>> createLotto() {	
		while (true) {
			if(amount%1000==0) {
				System.out.println(amount/1000+"개를 구매했습니다.");
				for (int i = 1; i <= amount/1000; i++) {
					lottoList.add(createNumbers(determineLotto()));
				}
			}
			break;
		}
		System.out.println(lottoList);
		return lottoList;
	}
	
	private List<Integer> determineLotto(){
		List<Integer> lottoNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) lottoNumbers.add(i);
		return lottoNumbers;
	}
	
	private List<Integer> createNumbers(List<Integer> lottoNumbers){
		Collections.shuffle(lottoNumbers);		
		List<Integer> pickedNumbers = lottoNumbers.subList(0, 6);
		Collections.sort(pickedNumbers);
		return pickedNumbers;
	}
	
	

	
	
	

	

	
	
}
