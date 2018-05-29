package java_example_20180524;

public class exercise {

String name;
int assignmentScore;
int examScore;

void result(){
	System.out.println("이름"+name);
	System.out.println("과제점수"+assignmentScore);
	System.out.println("시험점수"+examScore);
	if(((examScore+assignmentScore)/2)>=90) {
		System.out.println("학점"+"A");
	}else {
		System.out.println("학점"+"B");
	}
}
	
//학점 	System.out.println("학점"+getgrade());
//public String getgrade(){string grade; double  avg; (assignmentscore+examscore)/2=avg
 
	
}
