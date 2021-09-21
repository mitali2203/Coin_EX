package com.nt.service;



import org.springframework.stereotype.Service;


@Service
public class CoinService {

	public String getchange(double change) {
		int cents = (int) Math.round(change * 100);
		 int quarters =0;
		 int dimes =0;
		 int nickels = 0;
		 int pennies =0;
		 
		 while (cents-25 >= 0) {
			 cents=cents-25;
			 quarters ++;
			 
			 if(quarters == 100) {
				 break;
			 }
			
		}
		 
		 while (cents-10 >= 0) {
			 cents=cents-10;
			 dimes ++;
			 if(dimes == 100) {
				 break;
			 }
			
		}while (cents-5 >= 0) {
			 cents=cents-5;
			 nickels ++;
			 if(nickels == 100) {
				 break;
			 }
			
		}while (cents-1 >= 0) {
			if(pennies != 100) {
				cents=cents-1;
				 pennies ++;
				 
			 }
			 else {
				
				 break;
			 }
			 
			 
		}
		int coinsCounts=quarters +dimes + nickels +pennies;
		
		if(change < 42) {
			return ("We exchange "+ change+" Dollers like this : "+
					"\n\nThe number of needed quarters is "+ quarters + 
					"\nThe number of needed dimes is "+ dimes+
					"\nThe number of needed nickels is "+ nickels +
					"\nThe number of needed pennies is "+ pennies +
					"\n\nThe total  number of needed coins is "+ coinsCounts);
		}
		else {
			return ("There is no coin . So we can not exchange "+(cents/100)+ " Dollers."+"\nWe exchange "+ (change-(cents/100))+" Dollers like this : "+
					"\n\nThe number of needed quarters is "+ quarters + 
					"\nThe number of needed dimes is "+ dimes+
					"\nThe number of needed nickels is "+ nickels + 
					"\nThe number of needed pennies is "+ pennies +
					"\n\nThe total  number of needed coins is "+ coinsCounts);
			
		}
		
		
	}

	
}
