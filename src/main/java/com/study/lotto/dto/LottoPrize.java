package com.study.lotto.dto;

import java.util.HashMap;

public class LottoPrize {
	
	public LottoPrize() {
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePrize(HashMap<Integer, Integer> winnigCountMap) {
		int  cashPrize = 0;
        int totCashPrize = 0;
        for (Integer winnigCountKey : winnigCountMap.keySet()) {
			switch (winnigCountKey) {
			case 3:
				cashPrize = 50000;
				break;
			case 4:
				cashPrize = 1500000;
				break;
			case 5:
				cashPrize = 30000000;
				break;
			case 6:
				cashPrize = 2000000000;
				break;			
			}
			System.out.println(winnigCountKey+"개 일치 ("+cashPrize+") - "+winnigCountMap.get(winnigCountKey)+"개");
			totCashPrize += cashPrize * winnigCountMap.get(winnigCountKey);
		}
        
        return totCashPrize;
	}
	
}
