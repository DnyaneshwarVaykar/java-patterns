class ReplaceWithHighestDigit {
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] replaceElementWithHighest(int A[]){
		for (int i=0; i<A.length; i++) {
			int high=0;
			
			while (A[i]>0) {
				if (A[i]%10>high) {
					high=A[i]%10;
				}
				A[i]/=10;
			}
			A[i]=high;
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{123,235,6754,3257,64,2367,288,35,645,374};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=replaceElementWithHighest(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}