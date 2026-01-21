class divisibleProblem{
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] solutionArrey(int A[]){
		for (int i=0; i<A.length; i++) {
			if (A[i]%4==0 && A[i]%5==0) {
				A[i]=-3;
			}else if (A[i]%4==0) {
				A[i]=-1;
			}else if (A[i]%5==0) {
				A[i]=-2;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{10,14,24,12,18,26,20,23,22,15,26};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=solutionArrey(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}