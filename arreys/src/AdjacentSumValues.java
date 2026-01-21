class AdjacentSumValues{
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] solutionArrey(int A[]){
		int []arr=new int[A.length-1];
		for (int i=0; i<arr.length; i++) {
			int max=Math.max(A[i+1],A[i]);
			int min=Math.min(A[i+1],A[i]);
			arr[i]=max-min;
		}
		return arr;
	}

	public static void main(String[] args) {
		int []arr=new int[]{15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=solutionArrey(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}