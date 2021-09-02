package co.yedam.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {

		HashSet<String> lottoSet = new HashSet<String>(); // 셋 선언
		ArrayList<String> arrList = new ArrayList<String>(); // 리스트 선언

		while (lottoSet.size() < 6) { // 로또셋 사이즈를 어떻게 알아서 범위로 돌리는거지 ?
			int num = (int) (Math.random() * 45) + 1;

			lottoSet.add(num + ""); // 형변환 해주는거네 ? 대박

		}
		// set을 list에 담기

		arrList.addAll(lottoSet); // 합집합

		for (int i = 0; i < arrList.size(); i++) {
			if (i == 5) {
				System.out.print(arrList.get(i));
			} else {
				System.out.print(arrList.get(i) + ",");
			}
		}

	}
}
