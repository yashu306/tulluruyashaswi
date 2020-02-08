
import java.util.Map; 
import java.util.HashMap; 
import java.util.Iterator;
public class Caluculate {
	String s;
	int weight;
	public Caluculate(String s,int weight)
	{
		this.s=s;
		this.weight=weight;
	}
	public int schoc()
	{   int flag=0,n=0;
		Sweet cs=new Sweet();
		Choclate c=new Choclate();
		Map<String,Integer> gfg1=cs.sweetMenu();
		Map<String,Integer> gfg2=c.chocMenu();
		 Iterator<Map.Entry< String,Integer>> itr = gfg1.entrySet().iterator(); 
         
	        while(itr.hasNext()) 
	        { 
	             Map.Entry<String, Integer> entry = itr.next(); 
	            if( s.equals(entry.getKey()))
	           		{flag++;
                     break;      
	            	}
	            n++;
             } 
	        if(flag==0)
	        	return 0;
	        int a[]=new int[1000];
	        Iterator<Map.Entry<String, Integer>> itr2 = gfg2.entrySet().iterator();
	        int i=0;
	        while(itr2.hasNext()) 
	        { i++;
	             Map.Entry<String, Integer> entry1 = itr.next(); 
	             if(i==n)
	             {
	            	 System.out.println("the choclate he will get for that sweet is "+entry1.getKey());
	            	 System.out.println("the no of choclates are "+((1000-weight)/entry1.getValue()));
	            	 break;
	             }
	              
             } 
	       
	        return 1;
      } 
} 

	