class Shreya_java1_20Aug{
           public static void main(String[] args) {

           	   long fact=1;
	           long n=Long.parseLong(args[0]);
	           for(long i=n;i>=1;i--){
                     fact=fact*i;
	           }
	           System.out.println(fact);
          }
}