package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutomaticLottoBehavior implements LottoBehavior{
	
	private List<Integer> lottoNumbers;
	
	public AutomaticLottoBehavior() {
		lottoNumbers  = determineLotto();
	}
	
	@Override
	public List<Integer> createLotto() {
		Collections.shuffle(lottoNumbers);		
		List<Integer> pickedNumbers = lottoNumbers.subList(0, 6);
		Collections.sort(pickedNumbers);
		return pickedNumbers;
	}
	
	public List<Integer> determineLotto(){
		List<Integer> lottoNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) lottoNumbers.add(i);
		return lottoNumbers;
	}
}
