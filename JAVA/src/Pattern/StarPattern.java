package Pattern;

class StarPattern {
	public static void first() {
		int r=4;
		int c=5;
		
		//outer loop assign rows
		for (int i=1;i<=r;i++) {
			//inner loop assigns the column
			for(int j=1;j<=c;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public static void hallow() {
		int r=4;
		int c=5;
		
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=c;j++) {
				if(i==1 || j==1 || i==r || j==c) {
					System.out.print("*");
				}else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void halfpiramid() {
		int r=4;
		
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public static void invertedpiramid() {
		int r=4;
		
		for(int i=r;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	public static void invertedpiramid180() {
		int n=4;
		//outer loop assign rows
		for(int i=1;i<=n;i++) {
			// 1st inner lo0p for ---->empty space [ this j is differnt ] [4-1]=3
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			// 2nd inner lopp for columns star [[ this j is differnt ]] iteration 1=1,2=2,3=3,4=4
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void piramidNO() {
		int r=5;
		
		for (int i=1;i<=r;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void invertehalfdpiramidnum() {
		int n=5;
		
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
	
	public static void Floydsproblem() {
		int n=5;
		int increment=1;
		
		for(int i=1;i<=n;i++) {
			
			for (int j=1;j<=i;j++) {
				System.out.print(increment+" ");
				increment++;
			}
			System.out.println();
		}
	}
	
	public static void ZeroOneTriangle() {
		int n=5;
		
		for (int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				
				if(sum %2 ==0) {
					System.out.print("1 ");
				}else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	
	

	public static void main(String[] args) {
		
		//first();

		//hallow();
		
		//halfpiramid();
		
		//invertedpiramid();
		
		//invertedpiramid180() ;
		
		//piramidNO();
		
		//invertehalfdpiramidnum();
		
		//Floydsproblem();
		
		ZeroOneTriangle();
		
	}

}
