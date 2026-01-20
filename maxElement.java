class maxElement{

	static int findMaxElement(int []A){
		int max=0;
		for (int i=0; i<A.length; i++) {
			if (A[i]>max) {
				max=A[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int []arr = new int[]{12, 45, 67, 23, 89, 34};
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Max element is "+ findMaxElement(arr));

	}
}