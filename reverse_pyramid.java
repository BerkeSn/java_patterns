import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of rows you wanted==> ");
		int row = scan.nextInt();
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=row-1-i;k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
	}
