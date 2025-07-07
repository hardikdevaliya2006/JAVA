class arrayforEach{
	public static void main(String args[]){
		double[] numArray = {23.5,100.54,0.33,-55.6,5.2,-36.35656,49,87.9};
		double larg = numArray[0];
		
		for(double temp : numArray){
			if (larg<temp){
				larg=temp;
			}
		}
		System.out.format("Largest among this array is = %.2f ", larg);
	}
}