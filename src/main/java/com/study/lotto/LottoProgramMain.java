package com.study.lotto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.lotto.dto.Input;
import com.study.lotto.dto.Lotto;
import com.study.lotto.dto.Output;
import com.study.lotto.service.LottoService;

public class LottoProgramMain {
	
	public static void main(String[] args) {
		
		LottoService lottoService = new LottoService();
		Input input = new Input();
		Output output = new Output();
		
		output.printOfIntroduce();
		Scanner scanner = new Scanner(System.in);
		
		int number = input.checkVaild(scanner.nextInt());
		output.printResultofCheckVaild(number);
	
		List<Lotto> lottoSheet = lottoService.createLotto(number);
		output.printOfLottoSheet(lottoSheet);
		
		output.printWinnigNumbers();
		List<Integer> winningNoList = input.checkInputwinningNumbers(scanner.next());
		
		output.printBonusNumber();
		int bonusNum = input.checkInputBonusNumber(scanner.nextInt());
		
		List<Integer> winningLotto = lottoService.createWinningLotto(winningNoList, bonusNum);
		
		long totPrize = lottoService.matchLottoWithWinningLotto(winningLotto, lottoSheet);
		Map<Integer, Integer> countwinningLottoMap = lottoService.countWinningLottoResult();
		
		output.printLottoResult();		
		output.printLotto(countwinningLottoMap);
		output.printLottoResult(totPrize);

	}

}
