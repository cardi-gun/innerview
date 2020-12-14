package com.innerview.mvc00.user;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomCode {
	// 랜덤코드생성
	public String createKey() throws Exception {
		StringBuffer key = new StringBuffer();
		Random rnd = new Random();

		for (int i = 0; i < 6; i++) {
			int index = rnd.nextInt(3);

			switch (index) {
			case 0:
				key.append((char) ((int) (rnd.nextInt(26)) + 97));
				break;
			case 1:
				key.append((char) ((int) (rnd.nextInt(26)) + 65));
				break;
			case 2:
				key.append((rnd.nextInt(10)));
				break;
			}
		}
		return key.toString();
	}
}