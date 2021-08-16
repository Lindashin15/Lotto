package com.study.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.lotto.controller.LottoController;

@SpringBootApplication
public class LottoApplication implements CommandLineRunner {
	
	@Autowired
	private LottoController lottoController;
	
	public static void main(String[] args) {
		SpringApplication.run(LottoApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		lottoController.run();
    }

}
