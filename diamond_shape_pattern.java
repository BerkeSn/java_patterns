import java.util.Scanner;

  	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int i,j;
		int space = 1;
		
		System.out.print("Enter the number of rows you want to print==> ");
		int row=scan.nextInt();
		space = row-1;
		
		for(j=1;j<=row;j++) {
			for(i=1;i<=space;i++) {
				System.out.print(" ");
			}
			space--;
			for(i=1;i<=2*j-1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		space=1;
		
		for(j=1;j<=row-1;j++) {
			for(i=1;i<=space;i++) {
				System.out.print(" ");
			}
			space++;
			for(i=1;i<=2*(row-j)-1;i++) {
				System.out.print("*");
			}
			System.out.println("");	
		}
		
	}
