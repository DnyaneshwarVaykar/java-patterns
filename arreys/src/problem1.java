class problem1{
	public static void main(String[] args) {
		int [] A=new int[]{10,20,30,40,50};
		System.out.println("forward");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("Backward ");
		for (int i=A.length-1; i>=0; i--) {
			System.out.print(A[i]+" ");
		}
	}
}