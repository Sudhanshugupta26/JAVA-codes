package arrays;

public class jaggedArray {
		
	public static void main(String args[]) {
		int arr[][] = {{1,2,3,4},{1,2,3},{1,4}};
		//int arr[][] = new int [3][];
		//arr[0] = new int[4];
		//arr[1] = new int[3];
		//arr[2] = new int[2];
		for(int i=0;i<arr.length;++i) {
			for(int r : arr[i]) {
				System.out.print(r);
				
			}
		}
	}
}
