package labproject2.prob1;

import java.util.ArrayList;


public class TestWeeklyTemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//ArrayList <WeeklyTemps> testTemps = new ArrayList<WeeklyTemps>();	

double[] testTemps = {32.5, 88.3, 0.3, 100.3, 56.3, 23.5, 99.3};
		
		WeeklyTemps lastWeek = new WeeklyTemps();
		
		System.out.println("weekly temperature data(degrees F):");
		System.out.println("mean:    "+lastWeek.getMean(testTemps));
		
		System.out.println("range:   "+lastWeek.getRange(testTemps));
		
		System.out.println("extreme temp days:   "+lastWeek.getExtreme(testTemps));

	}

}
