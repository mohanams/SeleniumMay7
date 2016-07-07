package Day2;

import java.text.DecimalFormat;

public class PizzaCost {
	
	double lcost,rent;
	
	public PizzaCost(){
		lcost=0.75;
		rent=1.00;
	}
	
	public double calculatecost(int d){
		
		double pc;
		pc=((0.05*d*d)+lcost+rent);
		//return pc;
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.valueOf(df.format(pc));
	}

}
