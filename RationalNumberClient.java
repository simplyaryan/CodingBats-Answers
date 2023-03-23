public class RationalNumberClient
{
  	public static void main(String[] args)
   	 {
      RationalNumber rat1 = new RationalNumber(3, 4);
      RationalNumber rat2 = new RationalNumber(5, 2);
      RationalNumber rat3 = new RationalNumber(200, 300);
      
   	System.out.println("number of rationals greater than 1: " + RationalNumber.getNumGrowthFractions());
   	System.out.println("number of rationals less than 1: " + RationalNumber.getNumDecayFractions());
      System.out.println();
      
      RationalNumber multiplied = rat1.multiply(rat2);
      RationalNumber divided = rat1.divide(rat2);
      RationalNumber added = rat1.add(rat2);
      RationalNumber subtracted = rat1.subtract(rat2);
      //for reduced
      RationalNumber rat4 = new RationalNumber(36, 84);
      RationalNumber reduced  = rat4.reduce();
      //
      
    
      
      
      
      	System.out.println("3/4 * 5/2 = " + multiplied.toString());
      	System.out.println("3/4 / 5/2 = " + divided.toString());
      	System.out.println("3/4 + 5/2 = " + added.toString());
      	System.out.println("3/4 - 5/2 = " + subtracted.toString());
      
      //for reduced 
      System.out.println("reducing 36/84 = " + reduced.toString());
      //
      	System.out.println();
      
      

	//note: if you coded the reduce method, you should test that yourself
   	 }
/*EXPECTED OUTPUT:

    	number of rationals greater than 1: 1
	number of rationals less than 1: 2

	3/4 * 5/2 = 15/8
	3/4 / 5/2 = 6/20
	3/4 + 5/2 = 26/8
	3/4 - 5/2 = -14/8
    reducing 36/84 = 3/7
*/
}
