class problem3{
	public static void main(String[] args) {
		int []arr=new int[]{10,20,30,40,50};
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		float avg= (float)(sum/arr.length);
		System.out.println(avg);
	}
}