
public class FirstClass {

public static void main(String[] args) {
	//System.exit(0);
//	int a = Integer.parseInt(args[0]) ;
//	int b = Integer.parseInt(args[1]) ;
//	int c = a + b;
//	System.out.println("Sum is "+c);
	//int x [] = {10,20,30,40,50};
	//int [] x = {10,20,30,40,50};
	//int x[] = new int[5];
	int x[] = new int[] {10,20,30,40,50};
	System.out.println(x);
	FirstClass fs = new FirstClass();
	System.out.println(fs.toString());
	System.out.println(fs);
	//String v = new String();
//	for(int i = 0 ; i<x.length;i++) {
//		System.out.println(x[i]);
//	}
	// Enhance for loop
	for(int i : x) {
		System.out.println(i);
	}
	//int y[][] = new int[3][3];
	//int [][] y = new int[3][3];
	//int []y [] = new int [3][3];
	//int [][]y = {{1,2,3},{4,5,6},{7,8,9}};
	int [][]y = new int[3][];
	y[0] = new int[10];
	y[1] = new int[20];
	y[2] = new int[30];
	y[0][4] = 1;
	y[0][5] = 1;
	/*for(int i = 0;i<y.length; i++) {
		for(int j = 0; j<y[i].length; j++) {
			System.out.print(y[i][j]+" ");
		}
		System.out.println();
	}*/
	for(int i[]:y) {
		for(int j : i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	
	
	/*for(String a : args) {
		
	}*/
}

}
