package practice;

import java.util.HashMap;

/**
 * 
 * @author rohit_pc
 * TODO
 * 1) Learn char value how it differs from low case to high case
 * 2) Find the output loop and stuff from a code snippet
 * 
 */
public class Problem {
	
	int counter=0;
	
	public static void main(String[] args) {
		
		Problem p1 = new Problem();
//		p1.sortNumber(new int[] {2,4,1,-5,3,77,98});
//		p1.sortChar("rohitsingh");
//		char[] arr = "Rohit".toCharArray();
//		p1.reverseRecursive(arr);
//		p1.reverse("rohit");
//		p1.iterateBack("RohitSingh");
//		p1.fibonaci(10);
//		System.out.println("\n"+p1.fibonaciNTerm(4));
//		System.out.println("\n"+p1.fibDyn(100));
//		System.out.println(p1.isAnagram("rohit", "Tihor"));
		
		System.out.println(p1.sortSentence("my name is skrillex"));
		
		
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
	
	
	public void fibonaci(int terms) {
		
		int a = 0;
		int b =1;
		
		if(terms ==0) {
			System.out.println(a+" ");
		}else if(terms==1){
			System.out.println(b+" ");
		}
		if(terms>=2){
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=0;i<terms-2;i++) {
				System.out.print(a+b+" ");
				int c = a+b;
				a=b;
				b=c;
			}
		}
		
	}
	
	public int fibonaciNTerm(int terms) {
		if(terms==1)
			return 0;
		else if(terms ==2)
			return 1;
		else {
			int a = 0, b=1;
			int c=0;
			for(int i=0;i<terms-2;i++) {
				c = a+b;
				a=b;
				b=c;
			}
			
			return c;
		}
	}
	
	public int fib(int n) {
		
		System.out.println(++counter);
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		
		return fib(n-1)+fib(n-2);
		
		
	}
	
	public int fibDyn(int n) {
		
		HashMap<Integer,Integer> map = new HashMap();
		
		System.out.println(++counter);
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		
		if(map.get(n)!=null)
			return map.get(n);
		else {
			int value = fib(n-1)+fib(n-2);
			map.put(null, value);
			return value;
		}
			
	}
	
	
	public boolean isAnagram(String s1, String s2) {
		
		
		if(s1.length()!=s2.length())
			return false;
		
		s1 = sortString(s1);
		s2 = sortString(s2);
		
		return s1.contentEquals(s2);
		
		
		
	}
	
	public String sortString(String s) {
		char[] c = s.toCharArray();
		int n = c.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j =i+1;j<n;j++) {
				if(c[i]>c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		return new String(c);
	}
	
	public String sortSentence(String s) {
		
		String[] arr = s.split(" ");
		
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[i].length()>arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(String value:arr) {
			sb.append(value+" ");
		}
		
		String out = new String(sb);
		out = out.trim();
		return out;
		
	}
	
	
}



