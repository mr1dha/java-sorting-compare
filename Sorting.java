/**
	@author Muhammad Ridha
	@since March 17th 2020
*/

import java.util.*;
import java.io.*;

public class Sorting<T>{

	Scanner input;
	String[] arr = new String[5757];	
	TimeInterval ti = new TimeInterval();

	/**
		Menjalankan algoritma bubble Sort dan menghitung waktu proses
	*/
	public void bubbleSort(){
		String str[] = arr;
		System.out.println("\nStatus\t: Memulai Bubble Sort...");
		ti.startTiming();

		for (int j = 0; j < str.length; j++) {
	   	   for (int i = j + 1; i < str.length; i++) {

			if (str[i].compareTo(str[j]) < 0) {
				String temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		   }
		}
		ti.endTiming();
		display(str);
	    System.out.println("\nStatus\t: Selesai\nWaktu\t: " + ti.getElapsedTime()+ " detik");
	}
	/**
		Menjalankan algoritma Seletion Sort dan menghitung waktu proses
	*/
	public void selectionSort(){
		String str[] = arr;
		System.out.println("\nStatus\t: Memulai Selection Sort...");
		ti.startTiming();
		for ( int i=0; i < str.length-1; i++ ){
	     
	      int min = i;
	      for ( int j=i+1; j < str.length; j++ )
	        if ( str[j].compareTo( str[min] ) < 0 ) min = j;  

	      String temp = str[i];
	      str[i] = str[min];
	      str[min] = temp;
	    }
	    ti.endTiming();
	    display(str);
	    System.out.println("\nStatus\t: Selesai\nWaktu\t: " + ti.getElapsedTime()+ " detik");
	}
	/**
		Menjalankan algoritma Insertion  Sort dan menghitung waktu proses
	*/
	public void insertionSort(){
		String str[] = arr;
		System.out.println("\nStatus\t: Memulai Insertion Sort...");
		
		ti.startTiming();
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){
					String temp = str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}

		ti.endTiming();
		display(str);
	    System.out.println("\nStatus\t: Selesai\nWaktu\t: " + ti.getElapsedTime() + " detik\n");
	}

	/**
		Membaca isi File dan meletakkan ke dalam array 
	*/
	public void getData(){

		try{
			input = new Scanner(new File("sgb-words.txt"));
		}
		catch(Exception e){
			System.out.println("Oops! File tidak ditemukan.");
		}

		int i = 0;
		while(input.hasNext()){
			this.arr[i++] = input.next();
		}
	}

	public void display(String[] str2){
		for(String str : str2){
			System.out.println(str);
		}
	}
}