package java_example_20180818;

public class break_exampl2 {

	public static void main(String[] args) {
		//문제: 1+(-2)+3+(-4)+....형태로 더했을떄 얼마까지 더해야 총합이 100이상이되는지
int sum=0;//합
int num=1;//숫자
int count=1;//카운트용 변수
int s=1;// 부호용 변수
		/*while(true) {
	sum= sum + num;
	if(sum>=100)
		break;
	count++;//순차적 숫자증
	num=s*count;
	}*/
		for(count=1; sum<100; count++, s=-s) {
			num=count*s;
			sum=sum+num;
		}
System.out.println("숫자:"+ num);
System.out.println("합계:"+ sum);

}}