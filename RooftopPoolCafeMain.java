package lab0906;

public class RooftopPoolCafeMain {
	
	
	private static void callCafe() {
		
		RooftopPoolCafe r1 = new RooftopPoolCafeFactory().getRooftopPoolCafe();
		
		// getting rooftoppoolcafe object
		
		if (r1 !=null)
		{
			r1.welcomeDrink();
			r1.ambiance();
			r1.chilling();
			r1.prepareChowmin();
			r1.prepareKebab();
			
			if (r1 instanceof CafeStarlight)		// downcasting or checking the type
			{
				((CafeStarlight) r1).starlightCafeOffer();
			}
			
			else if (r1 instanceof CafeKiran)	// downcasting or checking the type
			{
				((CafeKiran) r1).kiranCafeOffer();;
			}
			
			
		}
		
		
		else {
			System.out.println("Try between Star light Cafe or Kiran Cafe");
			}
	}

	public static void main(String[] args) {
		
		callCafe();					// refactor custom method to minimize main()

	}

	
	

}
