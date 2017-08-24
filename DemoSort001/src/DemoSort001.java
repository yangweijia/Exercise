import java.util.*;

public class DemoSort001 {
	public static void sort(ArrayList<Integer> source)
	{
		int change=0;
		int changeInfo=0;
		for(int i=source.size();i>0;i--)
		{
			changeInfo=0;
			for(int j=0;j<i-1;j++)
			{
				if(source.get(j)>source.get(j+1))
				{
					change=source.get(j);
					source.set(j, source.get(j+1));
					source.set(j+1, change);
					changeInfo=1;
				}
			}
			if(changeInfo==0)
				break;
		}	
	}
	public static void main(String args[])
	{
		int[] source1= {3,4,8,5,33,23,13,28,1};
		ArrayList<Integer> source2=new  ArrayList<Integer>();
		for(int i=0;i<source1.length;i++)
		{
			source2.add(i,source1[i]);
		}
		sort(source2);
		System.out.println(source2);
	}

}

