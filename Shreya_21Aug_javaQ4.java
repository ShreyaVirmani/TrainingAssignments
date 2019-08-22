class Shreya_21Aug_javaQ4{
	public static void main(String[] args) {
        int[] a={56, 33, 222, -9, 6};
		    int n = a.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min]) 
                    min = j;   
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 

        for (int i=0; i<n; ++i) 
            System.out.print(a[i]+" "); 
		
	}
}



