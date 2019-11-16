package practice;


/**
 * 
 * @author rohit_pc
 * TODO
 * 1) Learn char value how it differs from low case to high case
 * 2) Find the output loop and stuff from a code snippet
 * 
 */
public class Problem {
	
	public static void main(String[] args) {
		
		Problem p1 = new Problem();
//		p1.sortNumber(new int[] {2,4,1,-5,3,77,98});
//		p1.sortChar("rohitsingh");
//		char[] arr = "Rohit".toCharArray();
//		p1.reverseRecursive(arr);
//		p1.reverse("rohit");
		p1.iterateBack("RohitSingh");
		
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
	
	
	public void reverseRecursive(char[] arr) {
		
		swap(arr, 0, arr.length-1);
		
		System.out.println(new String(arr));
	
	}
	
	public void swap(char[] arr, int low, int high) {
		
		if(low>high) {
			return;
		}
		
		char temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	
		swap(arr, ++low, --high);
	}
	
	public void reverse(String s) {
		
		char[] c = s.toCharArray();
		int n = c.length;
		int mid = n/2;
		for(int i=0;i<mid;i++) {
			char temp = c[n-1-i];
			c[n-1-i] = c[i];
			c[i] = temp;
		}
		
		System.out.println(new String(c));
	}
	
	public void iterateBack(String s) {
		char[] c = s.toCharArray();
		int n = c.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(c[n-1-i]);
		}
		
	}
	
	

}



