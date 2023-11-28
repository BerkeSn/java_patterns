import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the number of row you wanted==> ");
		int row=scan.nextInt();
		
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
	}
