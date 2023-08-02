 package sample;
 import java.util.Scanner; 
 import java. io.*; 
 public class Sample {
	 public void addArray(int[] arr) {
		 for(int i=0;i<5;i++) { 
			 System.out.println(arr[i]); 
			 } } 
	 public static void main(String[] args) {
		 Sample obj=new Sample(); 
		 try { 
			 int[] arr= {12,23,11,19};
			 obj.addArray(arr);
			 }
		 catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println("array out of range"); 
	 }}}
