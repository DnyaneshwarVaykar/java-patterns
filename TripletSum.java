class TripletSum{


	static void pairSum(int []A){
		int sum=30;
		System.out.println("pair of element of sum "+sum);
		for (int i=0; i<A.length-2; i++) {
			for (int j=i+1; j<A.length-1; j++) {
				for (int k=j+1; k<A.length; k++) {
					int a=A[i];
					int b=A[j];
					int c=A[k];
					if (a+b+c==sum) {
						System.out.println("("+a+","+b+","+c+")");
					}
				}
			}
		}
	}


	public static void main(String[] args) {
		int []arr= new int[]{3, 6, 9, 12, 15};
		pairSum(arr);
	}
}