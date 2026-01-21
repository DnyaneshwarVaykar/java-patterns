class ReverseEachElement{
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] reverseElementOfArrey(int A[]){
		for (int i=0; i<A.length; i++) {
			int res=0;
			
			while (A[i]>0) {
				res=res*10+A[i]%10;
				A[i]/=10;
			}
			A[i]=res;
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{123,235,6754,3257,64,2367,288,35,645,374};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=reverseElementOfArrey(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}