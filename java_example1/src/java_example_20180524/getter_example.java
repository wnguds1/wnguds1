package java_example_20180524;

public class getter_example {
	private String name;
	private 	int assignmentScore;
	private int examScore;
	public String getName() {
		return name;
	}
	public int getAssignmentScore() {
		return assignmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;

	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	public void result(){
		System.out.println(getName());
		System.out.println(getAssignmentScore());
		System.out.println(getExamScore());
		if(((examScore+assignmentScore)/2)>=90) {
			System.out.println("학점"+"A");
		}else {
			System.out.println("학점"+"B");
		}
	}
	
}
