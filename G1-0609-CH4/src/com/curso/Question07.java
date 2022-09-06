package com.curso;

import java.time.DayOfWeek;

public class Question07 {
	

	private DayOfWeek getWeekDay(int day, final int thursday) {
		int otherDay = day;
		final int Sunday = 0;
		switch (otherDay) {
		default:
		case 1: return null; //1E
		case 4: //2E
			return DayOfWeek.THURSDAY;
		case 2:
			break;
		case Sunday: //3E
			return DayOfWeek.SUNDAY;
		case 3: //DayOfWeek.MONDAY: //4E
			return DayOfWeek.MONDAY;

		}
		return DayOfWeek.FRIDAY;

	}

}
