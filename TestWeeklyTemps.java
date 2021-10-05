package labproject2.prob1;

public class TestWeeklyTemps {

	public static void main(String[] args) {
		double[] testTemps = {32.5, 88.3, 0.3, 100.3, 56.3, 23.5, 99.3};
		
		WeeklyTemps lastWeek = new WeeklyTemps();
		System.out.println("");
		System.out.println(lastWeek.getMean(testTemps));

		
	}

}
