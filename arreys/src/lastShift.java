class lastShift{


	static int[] lastToFirst(int arr[]){
		int last=arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		return arr;
	}
	public static void main(String[] args) {
		int []arr= new int[]{1,2,3,4,5};
		int a[]=lastToFirst(arr);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}