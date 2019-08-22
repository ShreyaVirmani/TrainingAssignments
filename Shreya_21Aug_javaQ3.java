class Shreya_21Aug_javaQ3{
public static void main(String[] args) {
		int[] arr={56,33,222,-9,6};
		int var=arr.length;
		int temp;
        temp=arr[0];
		for(int i=0;i<var-1;i++)
		{
             arr[i]=arr[i+1]; 
		}
		arr[var-1]=temp;
		for(int i=0;i<=var-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}