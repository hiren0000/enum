package com.rebel;

public class EnumExa {

	
	enum Website
	{
	 FOOD(200),HEALTH(50),TECHNOLOGY(100);
		
		int price;
		
	Website(int c )
	{
	 price = c;
		
	}
	
		
		
		public int getPrice()
		{
			return price;
		}
	}
		
	
//	class Website
//	{
//		 final Website FOOD = new Website();
//		 final Website HEALTH = new Website();
//		 final Website TECHNOLOGY = new Website();
//		
//	}
		
	
		
	
	
	public static void main(String[] args) 
	{
	   
	   System.out.println(Website.FOOD.getPrice());
	   
	   System.out.println(); 
	   
	   Website w[] = Website.values();
	   for(Website web: w)
	   {
		   System.out.println(web);
	   }

	}

}

