package java_example_20180524;

public class getter_setter {
//필드선언
	private int speed;
	private boolean stop;
	//메소드 선언 
	//speed 필드에 대한 getter 메소드 선언
	/*public int getSpeed() {
		return speed;
	}
	//speed 필드에대한 setter 메소드 선언
	public void setStop(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed=speed;
		}
		
	}//stop 에대한  getter 메소드
	public boolean isStop() {
		return stop;
		
	}//stop 필드에 대한 setter 메소드 선언
	public void setSop(boolean stop) {
		this.stop=stop;
				this.speed=0;*/
	public int getSpeed() {
		return speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	}

