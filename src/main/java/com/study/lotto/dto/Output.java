package com.study.lotto.dto;

import java.util.List;
import java.util.Map;

public class Output {
	
	public void printOfIntroduce() {
		System.out.println("구입금액을 입력해 주세요.");
	}
	
	public void printResultofCheckVaild(int vaildNo) {
		if(vaildNo == 0) {
			printUnvaildation();
			return;
		}
		printVaildation(vaildNo);
	}
	
	public void printUnvaildation() {
		System.out.println("유효하지 않은 금액입니다.");
	}
	public void printUnvaildationNumber() {
		System.out.println("유효하지 않은 금액입니다.");
	}
	
	public void printUnvaildationLottoLength() {
		System.out.println("당첨번호 갯수를 확인해주세요.");
	}
	
	public void printDuplicationNum() {
		System.out.println("중복된 번호입니다. 확인해주세요.");
	}
	
	public void printVaildation(int vaildNo) {
		System.out.println(vaildNo+"개를 구매했습니다.");
	}
	
	public void printOfLottoSheet(List<Lotto> lottoSheet) {
		for (Lotto lotto : lottoSheet) {
			System.out.println(lotto.getLotto());
		}
	}
	
	public void printWinnigNumbers() {
		System.out.println("지난 주 당첨 번호를 입력해 주세요");
	}
	
	public void printBonusNumber() {
		System.out.println("보너스 볼을 입력해 주세요.");
	}
		
	public void printLottoResult() {
		System.out.println("***************************");
		System.out.println("당첨 통계");
		System.out.println("***************************");
	}
	
	public void printLotto(Map<Integer, Integer> countwinningLottoMap) {
		for (Integer matchCount : countwinningLottoMap.keySet()) {
			System.out.println(matchCount+"개 일치 - "+countwinningLottoMap.get(matchCount)+" 개");
		}
	}
	
	public void printLottoResult(long totPrize) {
		System.out.println("총 당첨금은"+totPrize+"입니다.");
	}
	
}
