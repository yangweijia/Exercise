import java.util.*;

public class DemoBinarySearch001 {
	public static int demoBinarySearch001(ArrayList<Integer> source,int low,int high,int target)
	{
		System.out.println(low);
		System.out.println(high);
		int mid=(low+high)/2;
		if(low>high)
		{
			return -1;
		}
		else{
		if(source.get(mid)==target)
		{
			return mid;
		}
		else if(source.get(mid)>target)
		{
			return demoBinarySearch001(source,low,mid-1,target);
		}
		else
		{
			System.out.println(mid+1);
			return demoBinarySearch001(source,mid+1,high,target);
		}
		}
	}//demoBinarySearch001
	
	public static void main(String[] args)
	{
		int[] que1={3,6,13,22,35};
		ArrayList<Integer> que=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			que.add(que1[i]);
		}	
		System.out.println(demoBinarySearch001(que,0,4,3));
	}
}
