class problem5{
	public static void main(String[] args) {
		int []arr=new int[]{11,20,33,40,55};
		int oddsum=0;
		int evensum=0;
		int evencount=0;
		int oddcount=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2==1) {
				oddsum+=arr[i];
				oddcount++;
			}else {
				evensum+=arr[i];
				evencount++;
			}
			
		}
		float oddavg=(float)(oddsum/oddcount);
		float evenavg=(float)(evensum/evencount);
		System.out.println(oddavg);
		System.out.println(evenavg);
	}
}