import java.util.Calendar;

public class calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 이프로그램의 시작되는 시점에 날짜 정보를 cal에 담음
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);// MONTH는 0부터 시작 함 MONTH+1 = 현재달
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		cal.set(2020, 2, 1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);// MONTH는 0부터 시작 함 MONTH+1 = 현재달
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		createCalendar(2021, 7);
	}

	public static void createCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		cal.set(year, month, 0);
		cal2.set(year, month-1, 1);
		int count = 0;
		for (int i = 1; i < cal.get(Calendar.DAY_OF_MONTH) + cal2.get(Calendar.DAY_OF_WEEK); i++) {
			count++;
			if (i < cal2.get(Calendar.DAY_OF_WEEK)) {
				System.out.printf("\t");
			} else if (count % 7 == 0) {
				System.out.println(i - cal2.get(Calendar.DAY_OF_WEEK) + 1);
			} else {
				System.out.printf("%d\t", i - cal2.get(Calendar.DAY_OF_WEEK) + 1);
			}
		}
	}
}
