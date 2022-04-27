
public class ArrayEx3 {
	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {//배열내 2번째 요소부터 읽기 위해 시작값 1
			if (score[i] > max) {//배열내 요소가 max보다 크면
				max = score[i];// 그 숫자가 max
			}else if(score[i] < min){
				min = score[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
}
