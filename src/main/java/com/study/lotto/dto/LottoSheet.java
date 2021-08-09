package com.study.lotto.dto;

import java.util.ArrayList;
import java.util.List;

public class LottoSheet {
	
	public static List<Lotto> createLottoSheet(int no) {
		List<Lotto> lottoSheet = new ArrayList<Lotto>();
		for (int i = 0; i < no; i++) {
			Lotto lotto = new Lotto(new AutomaticLottoBehavior());
			lottoSheet.add(lotto);
		}
		return lottoSheet;
	}
	
}
