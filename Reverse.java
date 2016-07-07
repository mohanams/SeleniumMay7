package week6;

public class Reverse {

	public static void main(String[] args) {
		
		int[] array={10,254,3678,23,12};
		int s=array.length;
		int[] reverse=new int[s];
		int t=s-1;
		for(int i=0;i<s;i++,t--)
		{
			reverse[i]=array[t];
		}
		System.out.println("Actual array:");
		for(int i=0;i<s;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Reverse array:");
		for(int i=0;i<s;i++)
		{
			
			System.out.println(reverse[i]);
		}

	}

}
