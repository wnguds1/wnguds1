package java_example_20180818;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3열짜리 1차원 배열을 선언하고 스캐너를 이요하여 값을 하나하나 입력하고 입력값의 합 및 평균을 구하시오.
		Scanner scan= new Scanner(System.in);
		int[] score = new int[3];
		int length=score.length;
		int sum=0;
		for(int i=0; i<length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			score[i]=scan.nextInt();
			sum = sum+score[i];
		}
		int avg=sum/score.length;
		System.out.println("합"+sum+"평균"+avg);
	}
	

}
