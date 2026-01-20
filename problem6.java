class problem6{

	static int[] firstToLast(int A[]){
		A[0]=A[0] ^ A[A.length-1];
		A[A.length-1]=A[0] ^ A[A.length-1];
		A[0]=A[0] ^ A[A.length-1];

		return A;
	}

	public static void main(String[] args) {
		int []arr= new int[]{1,2,3,4,5};
		int []A =firstToLast(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}

	}
}