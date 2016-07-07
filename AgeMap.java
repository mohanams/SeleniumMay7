package Day6;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AgeMap {

	public static void main(String[] args) {
		
		Map<String, Integer> age=new LinkedHashMap<String, Integer>();
		age.put("Suresh", 10);
		age.put("Ramesh", 20);
		age.put("Sathish", 30);
		age.put("sailesh", 40);
		age.put("anvesh", 50);
		age.put("ritesh", 60);
		age.put("bijesh", 70);
		age.put("kailash", 80);
		age.put("jitesh", 90);
		age.put("nitish", 100);
		System.out.println("Order is maintained as they are added to map "+age);
		System.out.println("Number of elements in map is "+age.size());
		displayAge("Suresh", age);
		try
		{
		RemoveObject("Ramesh",age); 
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
		}
		System.out.println("Number of elements in map currently is "+age.size());
	}	
	public static void displayAge(String key,Map agemap) 
	{
	    Set<String> s=agemap.keySet();
		for (String i:s)
		{
		  if(i.equalsIgnoreCase(key))
		  {
			  System.out.println("Age of " +key+" is "+agemap.get(i));
		  }
		}
	}
	public static void RemoveObject(String key,Map agemap) 
	{
		
		Set<String> s=agemap.keySet();
		for (String i:s)
		{
		   if(i.equalsIgnoreCase(key)) 
		  {
			  agemap.remove(i);
			  System.out.println(key+" is removed from map");
		  }
		}
	}	
		

	

}
