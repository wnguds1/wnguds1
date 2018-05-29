package java_example_20180517;

import java.util.Scanner;

public class ifnesteadExample {


	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		int score1 = score.nextInt();
		String grade; 
            if(score1>=90) {
			if(score1>=95){
				grade = "A+";
			}else{
				grade = "A";}
            }else if(score1>=80) {
		    if(score1>=85) {
					grade = "B+";
			}else{
				grade = "B";}
            }else if(score1>=70) {
		    if(score1>=75) {
					grade = "C+";
		    }else{
		    	grade = "C";}   
	}else{
		    grade = "D";}
	System.out.println("학점은:"+ grade +"입니다.");
	}
	}



