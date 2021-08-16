package com.study.lotto.dto;

import org.springframework.stereotype.Component;

@Component
public class Output {
	
	public void printOfIntroduce() {
		System.out.println("구입금액을 입력해 주세요.");
	}
	
	public void UnvalidateAmount() {
		System.out.println("유효하지 않은 금액입니다.");
	}
	public void printUnvalidationNumber() {
		System.out.println("유효하지 않은 숫자입니다.");
	}
	
	public void printUnvalidationLottoLength() {
		System.out.println("당첨번호 갯수를 확인해주세요.");
	}
	
	public void printDuplicationNum() {
		System.out.println("중복된 번호입니다. 확인해주세요.");
	}
	
	public void printValidateAmount(int vaildNo) {
		System.out.println(vaildNo+"개를 구매했습니다.");
	}
	
	public void printOfLottoSheet(LottoSheetTo lottoSheetTo) {
		for (Lotto lotto : lottoSheetTo.getLottoList()) {
			System.out.println(lotto.getLotto());
		}
	}
	
	public void printWinnigNoList() {
		System.out.println("지난 주 당첨 번호를 입력해 주세요");
	}
	
	public void printBonusNo() {
		System.out.println("보너스 볼을 입력해 주세요.");
	}
		
	public void printLottoResult(LottoResultTo lottoResult) {
		System.out.println("***************************");
		System.out.println("당첨 통계");
		System.out.println("***************************");
		printMatchCountLotto(lottoResult);
		printTotPrize(lottoResult);
	}
	
	public void printMatchCountLotto(LottoResultTo lottoResult) {
		for (Integer matchCount : lottoResult.getCountwinningLottoMap().keySet()) {
			System.out.println(matchCount+"개 일치 - "+lottoResult.getCountwinningLottoMap().get(matchCount)+" 개");
		}
	}
	
	public void printTotPrize(LottoResultTo lottoResult) {
		System.out.println("총 당첨금은"+lottoResult.getTotPrize()+"입니다.");
	}
	
}
