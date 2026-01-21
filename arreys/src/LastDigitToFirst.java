class LastDigitToFirst{
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] firstToLast(int A[]){
		for (int i=0; i<A.length; i++) {
			int temp=A[i]/10;
			int last=A[i]%10;
			int multi=1;
			while (A[i]>9) {
				multi*=10;
				A[i]=A[i]/10;
			}
			A[i]=last*multi+temp;
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{123,235,6754,3257,64,2367,288,35,645,374};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=firstToLast(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}