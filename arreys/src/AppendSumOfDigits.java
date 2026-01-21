class AppendSumOfDigits{
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] appendSumOfDigitsArrey(int A[]){
		for (int i=0; i<A.length; i++) {
			int temp1=A[i];
			int sum=0;
			while (temp1>0) {
				sum+=(temp1%10);
				temp1=temp1/10;
			}
			int temp2=sum;
			int multi=1;
			while(temp2>0){
				multi*=10;
				temp2/=10;
			}
			A[i]=A[i]*multi+sum;
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{123,235,6754,3257,64,2367,288,35,645,374};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=appendSumOfDigitsArrey(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}