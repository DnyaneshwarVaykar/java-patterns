class secondMax{

	static int findMaxElement(int []A){
		int max=0;
		for (int i=0; i<A.length; i++) {
			if (A[i]>max) {
				max=A[i];
			}
		}
		return max;

	}
	static int secondMaxElement(int A[]){
		int smax=0;
		for (int i=0; i<A.length; i++) {
			if (A[i]>smax && A[i]<findMaxElement(A)) {
				smax=A[i];
			}
		}
		return smax;

	}

	public static void main(String[] args) {
		int []arr = new int[]{15, 72, 48, 96, 33, 81};
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Second Max element is "+ secondMaxElement(arr));

	}
}