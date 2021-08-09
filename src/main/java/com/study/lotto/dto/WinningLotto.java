package com.study.lotto.dto;

import java.util.Collections;
import java.util.List;

public class WinningLotto {
		
	public static List<Integer> createWinnigLotto(List<Integer> winningNoList, int bonusNum) {
		winningNoList.add(bonusNum);
		Collections.sort(winningNoList);
		return winningNoList;
	}	
	
}
