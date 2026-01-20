class problem4{
	public static void main(String[] args) {
		int []arr=new int[]{11,20,33,40,55};
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==1) {
				sum+=arr[i];
			}
			
		}
		
		System.out.println(sum);
	}
}