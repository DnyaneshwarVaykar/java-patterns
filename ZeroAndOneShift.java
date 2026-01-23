/*
Arrey befor sort
1 0 1 1 0 0 1 0
Arrey after sort
0 0 0 0 1 1 1 1
*/

class ZeroAndOneShift{
	static void displayArrey(int[] A){
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}

	static int[] sortArrey(int[] A){
		int left=0, right=A.length-1;

		while(left < right){
			if (A[left]==1 && A[right]==0) {
				A[left]	=A[left]+A[right];
				A[right]=A[left]-A[right];
				A[left]	=A[left]-A[right];
			}
			if (A[left]==0) {
				left++;
			}
			if (A[right]==1) {
				right--;
			}
		}
		return A;
	}
	

	public static void main(String[] args) {
		int[] arr=new int[]{1,0,1,1,0,0,1,0};
		System.out.println("Arrey befor sort ");
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after sort ");
		displayArrey(sortArrey(arr));

	}
}