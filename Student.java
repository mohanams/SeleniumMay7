package Day5;

public class Student {
	
	private String Name;
	private int English;
	private int Maths;
	private int Science;
	public Student(String name,int english,int maths,int science)
	{
		Name=name;
		English=english;
		Maths=maths;
		Science=science;
	}
	
	public String getName()
	{
		return Name;
		
	}
	public int getEnglishMarks()
	{
		return English;
		
	}
	public int getMathsMarks()
	{
		return Maths;
		
	}
	public int getSceinceMarks()
	{
		return Science;
		
	}
	
	

}
