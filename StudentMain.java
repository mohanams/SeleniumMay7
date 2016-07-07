package Day5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		
	
		Student student1 = new Student("Anu", 50, 55, 45);
		Student student2 = new Student("Asha", 60, 65, 55);
		Student student3 = new Student("Suresh", 70, 75, 65);
		Student student4 = new Student("Sai", 80, 85, 75);
		Student student5 = new Student("Ankith", 90, 95, 85);
		String sstudname="Ankith";
		
		System.out.println("************List Implementation*****************");
		
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		studentlist.add(student4);
		studentlist.add(student5);
		System.out.println("********Read all student names and marks**********");
		for(Student e:studentlist)
		{
			System.out.println(e.getName()+ "'s marks in English is  "+e.getEnglishMarks() +", marks in Maths is "+e.getMathsMarks()+", marks in Science is "+e.getSceinceMarks());
		}
		System.out.println("******Read specific student names and marks********");
		for(Student e:studentlist)
		{
			if (e.getName().equalsIgnoreCase(sstudname))
			System.out.println(e.getName()+ "'s marks in English is  "+e.getEnglishMarks() +", marks in Maths is "+e.getMathsMarks()+", marks in Science is "+e.getSceinceMarks());
		}
		
		System.out.println("************Map Implementation*****************");
		
		Map<String, Student> studentmap = new LinkedHashMap<String,Student>();
		studentmap.put("1",student1);
		studentmap.put("2",student2);
		studentmap.put("3",student3);
		studentmap.put("4",student4);
		studentmap.put("5",student5);
		System.out.println("********Read all student names and marks**********");
		for(String s:studentmap.keySet())
		{
			System.out.println("Student with Id number: "+s+ " name is "+studentmap.get(s).getName()+", English marks is "+studentmap.get(s).getEnglishMarks()+", Maths marks is "+studentmap.get(s).getMathsMarks()+" ,Science marks is "+studentmap.get(s).getSceinceMarks());
		}
		System.out.println("******Read specific student names and marks********");
		for(String s:studentmap.keySet())
		{
			if (studentmap.get(s).getName().equalsIgnoreCase(sstudname))
			  System.out.println("Student with Id number: "+s+ " name is "+studentmap.get(s).getName()+", English marks is "+studentmap.get(s).getEnglishMarks()+", Maths marks is "+studentmap.get(s).getMathsMarks()+" ,Science marks is "+studentmap.get(s).getSceinceMarks());
		}
		
	}

}
