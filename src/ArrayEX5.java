
public class ArrayEX5 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++){
			ball[i] = i+1;//첫번째 요소에 1을저장
		}
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j= (int) (Math.random()*45); //j에 랜덤저장
			tmp = ball[i];//tmp에 ball배열 요소 저장
			ball[i] = ball[j];//ball배열안에 랜덤수를
			ball[j] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}
