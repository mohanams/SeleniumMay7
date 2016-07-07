package Day5;

public class RemoveString {
	
	public String removalStr(String sen,String str )
	{
		int numwords;
		String word[]=sen.split(" ");
		numwords=word.length;
		for(int i=0;i<numwords;i++)
		{
	        System.out.println(word[i]);
			if(str.equals(word[i]))
	         {
	        	 sen=sen.replaceAll(str,"").replace("  "," ");
	        	 break;
	         }
		}
		return sen;
	}

}
