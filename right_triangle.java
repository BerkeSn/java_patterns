import java.util.Scanner; 

  	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the number of line==> ");
		int a=scan.nextInt();
		
		for(i=1;i<=a;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
