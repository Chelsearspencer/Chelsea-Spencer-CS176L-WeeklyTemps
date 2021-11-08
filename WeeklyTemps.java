package labproject2.prob1;

public class WeeklyTemps {
	
	
	public double getMax(double[] temps) {
		
		 //TODO: implement getMax
		 
		 double max=0.0;
		 
		 for(int i=0;i < temps.length; i++)
		if(temps[i] > max){
		 	max=temps[i];
		   }
		return max;
		
	}
	
	public double getMin(double[] temps) {
		
		 double min =0.0;
		 for(int i=0;i < temps.length; i++)
			 if(temps[i] < min){ 
			 }
		return min;
	}
	
	public String getRange(double[] temps) {
		
		 //TODO: iterate through and build string
		 
		double min = getMin(temps);
		double max = getMax(temps);
		 
		 String range = String.format("%.1f - %.1f", min, max);
		 
		 return range;
		 
		
	}
	
	public double getMean(double[] temps) {

		 //TODO: iterate through temps, calculate mean
		
		
		  double sum = 0.0;
		  for(int i=0; i < temps.length; i++) {
			  	sum += temps[i];
	
		  }
		  
		  double mean = sum/temps.length;
		  
		  return mean;
		  
		 
		
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
		
		 // TODO: count elements in extreme range
		  
	 int extreme = 0;
	 for(int i=0;i < temps.length; i++) {
		if(temps[i]>= 95) 
		{
			extreme+=1;
		 }
		else if (temps[i] <= 5) 
		{
			extreme+=1;
		}
	 }
		  return extreme;
	}
	}


