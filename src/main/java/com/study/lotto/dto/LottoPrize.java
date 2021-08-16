package com.study.lotto.dto;

import java.util.HashMap;
import java.util.Map;

public enum LottoPrize {
	
	FIRST(6,2000000000),
	SECOND(5,30000000),
	THIRD(4,1500000),
	FOURTH(3,50000);
		
	private int matchCount;
	private long prize;
	private static Map<Integer, Long> prizeMap = new HashMap<>();
	
	static {
		for (LottoPrize lottoPrize : LottoPrize.values()) {
			prizeMap.put(lottoPrize.matchCount, lottoPrize.prize);
		}	
	}
	
	private LottoPrize(int matchCount, long prize) {
		this.matchCount = matchCount;
		this.prize = prize;
	}
		
	public static long receivePrize(int matchCount) {		
		return prizeMap.getOrDefault(matchCount, (long)0);		
	}
	
}
