class Shreya_21Aug_javaQ5{
	public static void main(String[] args) {
		int[] a={12, 6, 2, 1};
		int i,j,n;
		n=a.length;
		for (i = 0; i < n-1; i++) {
			for (j = 0; j < n-i-1; j++){
                  if (a[j] > a[j+1]){
                  	int temp;
                  	temp=a[j];
                  	a[j]=a[j+1];
                  	a[j+1]=temp;
                  }  
                   
			    }
			   
		    }   
		for(i=0;i<n;i++)
	     {
	       System.out.print(a[i]+" ");
	     }
	}
}