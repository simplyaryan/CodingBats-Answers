import java.util.ArrayList;

public class Purse
{

	private ArrayList<Coin> tokens;
	
	//Default constructor
	//Instantiate the ArrayList object tokens
	public Purse()
     {
		tokens = new ArrayList<Coin>();
	}
	
	//adds q quarters, d dimes, n nickels, and p pennies 
	//to the purse.
	//make sure it is in the correct order: quarters, then dimes, then nickels, then pennies
	public Purse(int q, int d, int n, int p)
     {
       tokens = new ArrayList<Coin>();
        for(int i =0 ;i<q;i++){
          int value = 25;
          Coin quarters = new Coin(value,"quarters");
          tokens.add(quarters);
        }
        for(int i =0 ;i<d;i++){
          int value = 10;
          Coin dimes = new Coin(value,"dimes");
          tokens.add(dimes);
        }
      for(int i =0 ;i<n;i++){
          int value = 5;
          Coin nickels = new Coin(value,"nickels");
          tokens.add(nickels);
        }
      for(int i =0 ;i<p;i++){
          int value = 1 ;
          Coin pennies = new Coin(value,"pennies");
          tokens.add(pennies);
        }
      
	 }
	
	//adds a coin to the end of the purse
	public void addCoin(Coin c)
    {
		tokens.add(c);
	}
	
	//returns the number of quarters in the purse.  You cannot assume the purse is sorted in any order.
	public int numQuarters()
	{
      int count=0;
		for( int i = 0;i<tokens.size();i++){
          if(tokens.get(i).getName().equals("quarters")){
            count++;
          }
        }
      return count ; 
     }

//returns the number of dimes in the purse.  You cannot assume the purse is sorted in any order.
	public int numDimes()
	{
		int count=0;
		for( int i = 0;i<tokens.size();i++){
          if(tokens.get(i).getName().equals("dimes") || tokens.get(i).getValue() == 10){
            count++;
          }
        }
      return count ;//your code goes here
}

//returns the number of nickels in the purse.  You cannot assume the purse is sorted in any order.
	public int numNickels()
	{
		int count=0;
		for( int i = 0;i<tokens.size();i++){
          if(tokens.get(i).getName().equals("nickels")){
            count++;
          }
        }
      return count ;//your code goes here
}
	
	//returns the number of pennies in the purse.  You cannot assume the purse is sorted in any order.
	public int numPennies()
	{
		int count=0;
		for( int i = 0;i<tokens.size();i++){
          if(tokens.get(i).getName().equals("pennies")|| tokens.get(i).getValue() == 1){
            count++;
          }
        }
      return count ;//your code goes here
}

	//returns the total value of the purse in cents
	public int getValue()
    {
		
      int sum = 0;
      for(int i =0;i<tokens.size();i++){
        sum  = sum + tokens.get(i).getValue();
      }
      
     return sum; 
	}
	
	//returns true if any of the coins in the purse are dimes
	public boolean hasDimes()
    {
		
       for(int i = 0;i<tokens.size();i++){
         if(tokens.get(i).getName().equals("dimes")|| tokens.get(i).getValue() == 10){
           return true;
         }
       }
      return false;
	}
	
	//Converts all dimes to 2 nickels, returns true if a
	//conversion occurred, false if not.
	public boolean convertDimes()
     {
		boolean lol = false;
        for(int i =tokens.size()-1;i>0;i--){
          if(tokens.get(i).getName().equals("dimes")){
            tokens.remove(i);
            Coin nickels = new Coin(5,"nickels");
            tokens.add(nickels);
            tokens.add(nickels);
          }
        }
      
      return lol;
	}
	
	 //Makes a purchase by removing all the coins necessary 
     //to reach exactly, or go over, the price. Return true if you’re able to make the purchase
     //you should loop backwards for your code in this problem
     //if you do not have enough money in the purse, no coins are removed and return false.  
	public boolean makePurchase(int price)
    {
      int balance = price;
       if(balance>getValue()){
       return false;
       } 
      else{
        
         for( int i =0 ;i<tokens.size()-1;i++){
           if(tokens.get(i).getValue()<=balance){
             balance = balance - tokens.get(i).getValue();
             tokens.remove(i);
             i--;
           }
         }
        return true;
      }
		
      
	}
	
	//the toString method will print out the number of each type of coins in the purse, and also print out the total value of the purse in cents
	//for example, the a call to toString() might have this output:
	//"5 quarters, 3 dimes, 2 nickels, and 8 pennies, with a total value of 173 cents."
	//HINT: use some of the methods you have already coded!
	public String toString()
	{
		return numQuarters() + " quarters " + numDimes() + " dimes " + numNickels() + " nickels " + numPennies() + " pennies, with a total value of " + getValue() + " cents ";
    }
}

