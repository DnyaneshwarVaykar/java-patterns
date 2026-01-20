class reversWithoutT{
	static void displayArrey(int []A ){
		System.out.println("Arrey Befor Reverse ");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] shiftFirstToLast(int A[]){
		for (int j=0; j<A.length-1; j++) {
			for (int i=A.length-1; i>j; i--) {
				A[i]	=A[i] + A[i-1];
				A[i-1]	=A[i] - A[i-1];
				A[i]	=A[i] - A[i-1];
		}
	}
		return A;
	}
	public static void main(String[] args) {
		int []arr=new int[]{1,2,3,4,5};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after Reverse ");
		int Arr[]= shiftFirstToLast(arr);
		for (int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+" ");
		}
	}
}