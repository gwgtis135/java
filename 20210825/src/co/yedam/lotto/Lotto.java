package co.yedam.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {

		HashSet<String> lottoSet = new HashSet<String>(); // �� ����
		ArrayList<String> arrList = new ArrayList<String>(); // ����Ʈ ����

		while (lottoSet.size() < 6) { // �ζǼ� ����� ��� �˾Ƽ� ������ �����°��� ?
			int num = (int) (Math.random() * 45) + 1;

			lottoSet.add(num + ""); // ����ȯ ���ִ°ų� ? ���

		}
		// set�� list�� ���

		arrList.addAll(lottoSet); // ������

		for (int i = 0; i < arrList.size(); i++) {
			if (i == 5) {
				System.out.print(arrList.get(i));
			} else {
				System.out.print(arrList.get(i) + ",");
			}
		}

	}
}
