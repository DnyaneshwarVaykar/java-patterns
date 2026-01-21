class AverageOfDigits{
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] averageOfDigitsArrey(int A[]){
		for (int i=0; i<A.length; i++) {
			int sum=0;
			int count=0;
			while (A[i]>0) {
				sum+=(A[i]%10);
				A[i]=A[i]/10;
				count++;
			}
			A[i]=sum/count;
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{123,235,6754,3257,64,2367,288,35,645,374};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=averageOfDigitsArrey(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}