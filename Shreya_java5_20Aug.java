class Shreya_java5_20Aug{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int sum=0;
		sum=a+b+c;
		int flag=0;
		if(a>=40)
			flag++;
		if(b>=40)
			flag++;
		if(c>=40)
			flag++;
		if(sum>=125)
			flag++;
		int ch=flag;
		switch(ch)
		{
             case 4:System.out.println(" PASSING ");
             break;
             default: System.out.println("FAILING");
		}
	}
}


