package java_example_20180521;

import java.util.Scanner;

public class arrayexample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] words= {
		{"chair","의자"},
		{"desk","책상"},
		{"water","물"},
		{"monitor","모니터"},
		{"mouse","마우스"}};//scan으로 입력하여 맞으면 맞혔ㅆ쁘니다 맞은개수: 틀렸으면 다음걸로
Scanner scan= new Scanner(System.in);


int count=0;
int length=words.length;
int count1=0;
for(int i=0; i<words.length; i++) {
	count++;
		System.out.println("문제"+count+"."+words[i][0]+"뜻은무엇인요");		
		String w=scan.nextLine();
		

	System.out.println(words[i][1]);
		if(words[i][1].equals(w)) {
			
			System.out.println("맞혔습니다.");
			count1++;
		}else{
		System.out.println("틀렸습니다.");
		}
		
}double avg=100*((double)count1/words.length);
System.out.println("총"+count1+"개를 맞췄습니다."+"정답률은"+avg+"%입니다.");
		}}
	

	
