package java_example_20180523;
//p233
public class car3 {
//필드 선언
	int gas;
	//매소드 선언
	void setGas(int gas ) {
		this.gas=gas;
	}
	boolean isleftgas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false;
		}System.out.println("gas가 있씁니다.");
		return true;
		
	}void run(){
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량:"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas 잔량:"+gas+")");
				return;
			
			}
		
		}
	}
	
	}

