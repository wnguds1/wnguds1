package java_example_20180521;

import java.util.Scanner;

public class foreach_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= {1,2,3,4,5};
		String[] fruit = {"사과,배,바나나,체리,딸기,포도"};
		int sum=0;
		for(int scores : score){
		sum = sum + scores;
		System.out.print(scores);}
		System.out.println("합은"+sum);
		for(String fruit2 : fruit) {
			System.out.println(fruit2);
		}
	}

}
