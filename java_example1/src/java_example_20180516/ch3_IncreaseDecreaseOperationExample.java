package java_example_20180516;

public class ch3_IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//증감연산자 
		//변수뒤에 ++이 붙으면 1을증가시키기고 계산
		//변수 앞에 ++이 붙으면 일단 변수값을 사용하고 1을 증가
		int x=10;
		int y=10;
		int z;
		System.out.println("---------------------");
		System.out.println("x="+x);
		x++;//x값을 사용하고 1증가
		System.out.println("x= x++한후"+x);
		++x;// 기존x값에서 1을 증가시키고 x를사용
		System.out.println("x= ++x 한후"+x);
		System.out.println("---------------------");
		y--;
		System.out.println("y= y--한후"+y);
		--y;
		System.out.println("y="+y);
		System.out.println("---------------------");
		z=x++;
		//x가 가지고있는값을 먼저 x에대입하고 x값을 1증가
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("---------------------");
		z=++x;
		
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("---------------------");
		z = ++x + y++; //x= 15 y 8 z 23
		System.out.println("z="+z);//22
		System.out.println("x="+x);//11
		System.out.println("y="+y);//11
	}

}
