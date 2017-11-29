package williams.calvin;

public class WhatDayIsIt {
	int year;
	int month;
	int day;

	public static void main(String[] args) {
		if (args.length == 3) {
			WhatDayIsIt o = new WhatDayIsIt();
			o.year = Integer.parseInt(args[0]);
			o.month = Integer.parseInt(args[1]);
			o.day = Integer.parseInt(args[2]);

			System.out.println(o.findDay());
		} else {
			System.out.println("Please enter a valid input in the form of 'yyyy mm dd'");
		}
	}

	public String findDay() {
		if (month < 3) {
			year--;
			month += 12;
		}
		int q = day;
		int m = month;
		int K = year % 100;
		int J = year / 100;

		int d = (q + 13 * (m + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

		switch (d) {
		case 0:
			return "Saturday";
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday, my dudes";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		default:
			return "Invalid Date";
		}
	}

}
