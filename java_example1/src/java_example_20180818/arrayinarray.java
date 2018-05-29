package java_example_20180818;

public class arrayinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] mathScores=new int[2][3];
for(int i=0; i<mathScores.length; i++) {
	for(int k=0; k<mathScores[i].length; k++) {
		System.out.println("mathScores["+i+"]["+k+"]="+
	mathScores[i][k]);
	}
}System.out.println();
int[][] englishscore=new int[2][];
englishscore[0]=new int[2];//1행에 2개의 열 배정
englishscore[1]=new int[3];//2행에 3개의 열 배정
for(int i=0; i<englishscore.length; i++) {
	for(int k=0; k<englishscore[i].length; k++) {
		System.out.println("englishscore["+i+"]["+k+"]="+
	englishscore[i][k]);
	}
}
int[][] javascore= {{95,80},{92,96,80}};
for(int i=0; i<javascore.length; i++) {
	for(int k=0; k<javascore[i].length; k++) {
		System.out.println("mathScores["+i+"]["+k+"]="+
	javascore[i][k]);
	}
}
}
}