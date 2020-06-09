import  java.util.*;
 class TestSorting2 {

	
	 int quickSort(int arr[],int p,int r) {
	int x=arr[r];
	int j=p;
	int i=p-1;
while(arr[j]<x&&i>=0) {
	i=i+1;
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
	
	
}

int temp1=arr[r];
arr[r]=arr[i+1];
arr[i+1]=temp1;
return i+1;
		
		
	}
	void QuickSort(int A[], int p,int r){
		int q;
		if(p<r) {
			q= quickSort(A,p,r);
			QuickSort(A,p,q-1);
			QuickSort(A,q+1,r);

		}
	}
	
	public static void main(String pawan[]) {
	
	TestSorting2 s=new TestSorting2();
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<n;i++) {
		A[i]=sc.nextInt();
		
	}
	s.QuickSort(A,0,n-1);
	for(int i=0;i<n;i++) {
		System.out.println(A[i]+" ");
	}
	
	
	}
}
