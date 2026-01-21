class DivisibleAndContainsProblem {
	static void displayArrey(int A[]){
		System.out.println("Arrey Befor change");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
	static int[] solutionArrey(int A[]){
		for (int i=0; i<A.length; i++) {
			int temp=A[i];
			boolean flag=false;
			while (temp>0) {
				if (temp%10==6)
					flag=true;
				temp/=10;
			}
			if (A[i]%6==0 && flag==true) {
				A[i]=-3;
			}else if (A[i]%6==0) {
				A[i]=-1;
			}else if (flag==true) {
				A[i]=-2;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int []arr=new int[]{15,23,18,26,72,36,49,38,60,17,22,46};
		displayArrey(arr);
		System.out.println();
		System.out.println("Arrey after change ");
		int A[]=solutionArrey(arr);
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}