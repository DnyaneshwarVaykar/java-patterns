

class pairOfSsum{

	static void pairSum(int []A){
		int sum=20;
		System.out.println("pair of element of sum "+sum);
		for (int i=0; i<A.length-1; i++) {
			for (int j=i+1; j<A.length; j++) {
				int a=A[i];
				int b=A[j];
				if (a+b==sum) {
					System.out.println("("+a+","+b+")");
				}
			}
		}
	}


	public static void main(String[] args) {
		int []arr= new int[]{4, 8, 12, 16,11,9};
		pairSum(arr);
	}
}