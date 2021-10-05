package labproject2.prob1;

public class WeeklyTemps {
	
	public double getMax(double[] temps) {
		/**
		 * TODO: implement getMax
		 * 
		 * double max=0.0;
		 * 
		 * i.e. for(int i=0;...)
		 * 	if(temps[i] > max){
		 * 		max=temps[i];
		 *   }
		 * -return max
		 */
		return 0.0;
	}
	
	public double getMin(double[] temps) {
		/**
		 * TODO: return min value in array
		 */
		return 0.0;
	}
	
	public String getRange(double[] temps) {
		/**
		 * TODO: iterate through and build string
		 * 
		 * double min = getMin(temps);
		 * double max = getMax(temps);
		 * 
		 * String range = String.format("%.1f - %.1f", min, max)
		 * 
		 * return range;
		 */
		return "66.1 - 79.5"; 
	}
	
	public double getMean(double[] temps) {
		/**
		 * 
		 * TODO: iterate through temps, calculate mean
		 * return mean
		 * 
		 * double sum = 0.0;
		 * for(int i=0, ...) {
		 * 	sum += temps[i];
		 * }
		 * 
		 * double mean = sum/temps.length;
		 * 
		 * return mean;
		 * 
		 */
		return 0.0;
	}
	
	/**
	 * getExtreme:
	 * 
	 * Returns the number of days during the week 
	 * when the temperature was either 
	 * <= 5 degrees or >= 95 degrees F.
	 * 
	 * @param temps
	 * @return
	 */
	public int getExtreme(double[] temps) {
		/**
		 * TODO: count elements in extreme range
		 * 
		 * int count = 0;
		 * for(i=0..){
		 * 	if(...){
		 * 	count +=1;
		 *  }
		 * }
		 * 
		 * return count;
		 */
		return 0;
	}
}
