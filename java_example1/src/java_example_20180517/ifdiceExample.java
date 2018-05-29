package java_example_20180517;



public class ifdiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*random 메소드
 *Math.random() :double 실수0.0<= ()<1.0
 *1~9까지의 난수를 발생시키리면 
 *(int)(Math.random()*10) e더블이 인트보다 커서 강제형변화필요
 *1~10까지의 난수
 *int num = (int)(Math.random()*10)+1
 *로또번호
 *(int)(Math.random()*45)+1
 *
 *주사위 번호뽑기
 *(1~6 까지의난수 1이나오면 1번이나왔습니다.~~~~)
 */
	
		int dice=(int)(Math.random()*6)+1;
		if(dice==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(dice==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(dice==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(dice==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(dice==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		
	
	}

}
