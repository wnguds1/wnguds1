package java_example_20180524;
//singletone 예제
public class singletone1 {
	
	private static singletone1 singLeton=new singletone1();
	private singletone1() {
		
	}
	static singletone1 getInstance(){
		return singLeton;
	}

}
