package MonkeySmile;

public class MonkeySmile {
	
	String smile;
	public MonkeySmile(String s)
	{
		smile=s;
	}
	
	public static boolean trouble(String asmile,String bsmile)
	{
		boolean trouble=false;
		if ( (asmile.equalsIgnoreCase("smiling") && bsmile.equalsIgnoreCase("smiling")) || (asmile.equalsIgnoreCase("notsmiling") && bsmile.equalsIgnoreCase("notsmiling")) )
		{
			trouble= true;
		}
		return trouble;
	}

}
