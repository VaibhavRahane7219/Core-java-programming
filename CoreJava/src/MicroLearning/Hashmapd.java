package MicroLearning;
import java.util.*;

public class Hashmapd 
{
	public static void main(String[] args) 
	{
HashMap <Integer , String> map =
new <Integer, String> HashMap();
map.put(101, "ABC");
map.put(102,"XYZ" );
map.put(103,"EBC" );
map.put(104, "LMN");
//System.out.println(hm);
//Set s=hm.entrySet();
Iterator i = map.keySet().iterator();
		while(i.hasNext())
//for(Map.Entry m : map.entrySet())
			{    
				int key=(int)i.next();
				System.out.println(key+" "+map.get(key));    
	
			}
	
	}
}
