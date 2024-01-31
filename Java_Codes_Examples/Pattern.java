
public class Pattern {
	public static void main(String[] args) {
//		Pattern1(5);
//		System.out.println();
//		Pattern2(5);
//		System.out.println();
//		Pattern3(5);
//		System.out.println();
		Pattern4(5);
	}
	
	static void Pattern1(int n) {
		for(int row = 0; row<n; row++) {
			for(int col = 0; col< n; col++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
//	static void Pattern2(int n) {
//		for(int row = 0; row<n; row++) {
//						
//			for(int col =0 ; col< n; col++ ) {
////				System.out.print("*");
//				for(int spaces = 1; spaces < n ; spaces ++) {
//					System.out.print("_");
//				}
////				System.out.print("*");
//				
//
//			}
//			System.out.println();
//		}
//	}
	
	
	static void Pattern2(int n) {
		for(int row = 0; row<n; row++) {
			for(int col = 0; col< n; col++ ) {
				if(row == 0 || col==0 || row == n-1 || col == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void Pattern3(int n) {
		for(int row = 1; row < n*2 ; row++) {
			int c = row > n ? 2 * n - row : row; 
			
			for (int space = 0; space < n - c; space++) {
                System.out.print("  ");

            }
            for (int col = c ; col >= 1 ; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
	}
	
	static void Pattern4(int n) {
		for(int row = 0 ; row< n*2; row++ ) {
			for(int col = n; col >  1 ; col--  ) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
}
