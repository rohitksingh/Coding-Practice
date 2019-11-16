package practice;


/**
 * 
 * @author rohit_pc
 * TODO
 * 1) Learn char value how it differs from low case to high case
 * 
 * 
 */
public class Problem {
	
	public static void main(String[] args) {
		System.out.println("Its working");
		
		Problem p1 = new Problem();
//		p1.sortNumber(new int[] {2,4,1,-5,3,77,98});
//		p1.sortChar("rohitsingh");
		char[] arr = "Rohit".toCharArray();
		p1.reverseRecursive(arr, 0, arr.length-1);
		
	}
	
	
	
	
	public void sortNumber(int[] a) {
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		display(a);
		
	}
	
	
	public void sortChar(String name) {
	
		char[] c = name.toCharArray();
		int n = c.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(c[i]>c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		
		System.out.println(new String(c));
		
	}
	
	
	
	public void display(int[] a) {
		
		for(int value: a) {
			System.out.print(value+" ");
		}
		
	}
	
	public void reverseRecursive(char[] arr, int start, int end) {
		
		if(start>end) {
			System.out.println(new String(arr));
			return;
		}
		
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverseRecursive(arr,start+1,end-1);
		
		
	}
	
	

}



