package java_example_20180525;


public class member {
String id;
int password;



boolean  login(String id, int password) {
	if(id.equals("yourid") && password==12345) {
		return true;
	}else {
		return false;
	}
	}
void logout(String id){
	System.out.println("로그아웃되었습니다.");
	}
	
}

