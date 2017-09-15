package com.karthik.hibernate.Assignment71;


import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Flower flower1 = new Flower();
    	flower1.setFlowerId("101");
    	flower1.setFlowerType("Anemone");
    	flower1.setWeeklySales("1200");
    	
    	Flower flower2 = new Flower();
    	flower2.setFlowerId("202");
    	flower2.setFlowerType("Irises");
    	flower2.setWeeklySales("5000");
    		
    	Manager manager1 = new Manager();
    	manager1.setManagerId("Buttercup");
    	manager1.setManagerName("manager one");
    	
    	Manager manager2 = new Manager();
    	manager2.setManagerId("404");
    	manager2.setManagerName("manager 404");
    	
    	FlowerShop shop = new FlowerShop();
    	shop.setFlowerShopId("502");
    	shop.setFlowerShopName("Shop1");
    	
    	shop.getFlowers().add(flower1);
    	shop.getFlowers().add(flower2);
    	shop.getManagers().add(manager1);
    	shop.getManagers().add(manager2);
    	
    	Session session = ServiceProvider.getSession();
    			
    	session.beginTransaction();
    //-----------------------------------

    	
    	session.save(shop);
    	session.save(manager1);
    	session.save(flower1);
    	session.save(flower2);
    	session.save(manager2);
    					
    		
    //------------------------------------	
    	session.getTransaction().commit();
    			
    	session.close();
    }
}