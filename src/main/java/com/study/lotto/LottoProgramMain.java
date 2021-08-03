package com.study.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.study.lotto.service.LottoService;

public class LottoProgramMain {

	public static void main(String[] args) {
		LottoService lottoService = new LottoService();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구입금액을 입력해 주세요.");		
		int amount = scanner.nextInt();
		
		List<List<Integer>> lottoList = lottoService.getLottoList(amount);
		
		
	
		System.out.println("지난 주 당첨 번호를 입력해 주세요");
		String winningNumbers = scanner.next();
		
		System.out.println("보너스 볼을 입력해 주세요.");
		int bonusNum = scanner.nextInt();
		
		ArrayList<Integer> winningNoList = lottoService.getWinningLotto(winningNumbers, bonusNum);

		ArrayList<Integer> winningResult = lottoService.getWinnigNumbers(lottoList, winningNoList);
		
		System.out.println("******************************");		
		System.out.println("당첨 통계");
		System.out.println("******************************");
		
		
		int totCashPrize = lottoService.getLottoPrize();
	
        System.out.println("총 수익률은 "+totCashPrize/amount+"입니다.");

		
		
	}
	
	
	

}
