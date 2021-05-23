import java.util.*;
class Operations {
	public int search(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	public void bubblesort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i < n-1; i++)
		{
			for(int j =0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
class MyThread extends Thread{
	Operations ops;
	public void start()
	{
		ops = new Operations();
	}	
	public int run(int i,int arr[],int x)
	{
		if(i == 1)
		{
			this.ops.bubblesort(arr);
		}
		else if(i == 2)
		{
			return this.ops.search(arr, x);
		}
		else if(i==3)
		{
			this.ops.printArray(arr);
		}
		return -1;
	}
}
public class ThreadJoin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers to sort ?");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		int x;
		System.out.println("Enter the element to be searched");
		x=s.nextInt();
		MyThread search = new MyThread();  
		MyThread sort = new MyThread();
		try {
			System.out.println("Starting Thread Sort");
			System.out.println("Starting Thread Search");
			sort.start();
			search.start();
			sort.run( 1, arr, 0);
	    sort.join();
	    System.out.println("Thread Sort exiting.");
	    System.out.println("The sorted array is");
	    sort.run(3,arr,0);
	    int res = search.run(2,arr,x);
	    if(res == -1)
	    {
	    	s.close();
	    	throw new Exception("Element not found or wrong input");
	    }
	    System.out.println("Element is present at Position "+ (res+1));
	    search.join();
        System.out.println("Thread Search exiting.");
		}
		catch(Exception e)
		{
		   System.out.println(e);
		}
		s.close();
	}
}